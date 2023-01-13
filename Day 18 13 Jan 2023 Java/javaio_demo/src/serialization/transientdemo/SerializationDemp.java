package serialization.transientdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NameStore implements Serializable {
	private String firstName, lastName;
	private transient String fullName;

	public NameStore(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
		buildFullName();
	}

	private void buildFullName() {
		// assume building fullName is compuational/memory intensive!
		this.fullName = this.firstName + " " + this.lastName;
	}

	public String toString() {
		return "First Name : " + this.firstName + "\nLast Name : " + this.lastName + "\nFull Name : " + this.fullName;
	}

	private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
		inputStream.defaultReadObject();
		buildFullName();
	}
}

public class SerializationDemp {
	public static void main(String args[]) throws Exception {
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("ns.ser"));
		o.writeObject(new NameStore("Steve", "Jobs"));
		o.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("ns.ser"));
		NameStore ns = (NameStore) in.readObject();
		System.out.println(ns);
		
		
	}
}

/**
 * 
 * https://www.oracle.com/technical-resources/articles/java/serializationapi.html
 * 
 * Stop That Serialization! OK, we have seen quite a bit about the serialization
 * process, now let's see some more. What if you create a class whose superclass
 * is serializable but you do not want that new class to be serializable? You
 * cannot unimplement an interface, so if your superclass does implement
 * Serializable, your new class implements it, too (assuming both rules listed
 * above are met). To stop the automatic serialization, you can once again use
 * the private methods to just throw the NotSerializableException.
 * 
 * 
 * 10 private void writeObject(ObjectOutputStream out) throws IOException
 * 
 * 20 {
 * 
 * 30 throw new NotSerializableException("Not today!");
 * 
 * 40 }
 * 
 * 50 private void readObject(ObjectInputStream in) throws IOException
 * 
 * 60 {
 * 
 * 70 throw new NotSerializableException("Not today!");
 * 
 * 80 }
 * 
 * Any attempt to write or read that object will now always result in the
 * exception being thrown. Remember, since those methods are declared private,
 * nobody could modify your code without the source code available to them -- no
 * overriding of those methods would be allowed by Java.
 * 
 * 
 */

//There is another interface called Externalizable which extends Serializable
//The purpose of this interface is to define your own strategy for serializing and deserializing objects.
//public interface Externalizable extends java.io.Serializable {