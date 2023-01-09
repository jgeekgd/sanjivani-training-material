package nestedinterface.Interface.Inside.Class;

/**
 * 
 * An interface, i.e., declared within another interface or class, is known as a
 * nested interface. The nested interfaces are used to group related interfaces
 * so that they can be easy to maintain. The nested interface must be referred
 * to by the outer interface or class. It can't be accessed directly.
 * 
 * Points to remember for nested interfaces There are given some points that
 * should be remembered by the java programmer.
 * 
 * The nested interface must be public if it is declared inside the interface,
 * but it can have any access modifier if declared within the class. Nested
 * interfaces are declared static
 * 
 *
 *
 *
 * Interfaces (or classes) can have only public and default access specifiers
 * when declared outside any other class (Refer this for details). This
 * interface declared in a class can either be default, public, protected not
 * private. While implementing the interface, we mention the interface as
 * c_name.i_name where c_name is the name of the class in which it is nested and
 * i_name is the name of the interface itself.
 *
 */
class Test {
	interface Yes {
		void show();
	}
}

class Testing implements Test.Yes {
	public void show() {
		System.out.println("show method of interface");
	}
}

public class Main {
	public static void main(String[] args) {
		Test.Yes obj;
		Testing t = new Testing();
		obj = t;
		obj.show();
	}
}
