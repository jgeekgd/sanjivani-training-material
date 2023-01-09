package dimond.problem;

class A {
	public void display() {
		System.out.println("class A display() method called");
	}
}

class B extends A {
	@Override
	public void display() {
		System.out.println("class B display() method called");
	}
}

class C extends A {
	@Override
	public void display() {
		System.out.println("class C display() method called");
	}
}

//not supported in Java  
class D extends B //,C ---> Syntax error on token ",", . expected
{
//
//	@Override
//	public void display() {
//		System.out.println("class C display() method called");
//	}
}

public class Main {
	public static void main(String args[]) {
		D d = new D();
		//creates ambiguity which display() method to call  
		d.display();
	}
}


/**
 * 
 * In Java, the diamond problem is related to multiple inheritance. 
 * Sometimes it is also known as the deadly diamond problem or deadly diamond of death. 
 * In this section, we will learn what is the demand problem in Java and what is the solution to the diamond problem.
 * Class B and class C inherits the class A. The display() method of class A is overridden by the class B and class C.
 * Class D inherits the class B and class C (which is invalid in Java). Assume that we need to call the display() method
 * by using the object of class D, in this scenario Java compiler does not know which display() method to call. Therefore, it creates ambiguity.
 * 
 */