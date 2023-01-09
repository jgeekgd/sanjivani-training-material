package nestedinterface.Interface.Inside.Class;

/**
 * We can assign public, protected or private also. Below is an example of
 * protected. In this particular example, if we change access specifier to
 * private, we get compiler error because a derived class tries to access it.
 * 
 */
class Test1 {
	protected interface Yes {
		void show();
	}
}

class Testing1 implements Test1.Yes {
	public void show() {
		System.out.println("show method of interface");
	}
}

public class Main2 {
	public static void main(String[] args) {
		Test1.Yes obj;
		Testing1 t = new Testing1();
		obj = t;
		
		obj.show();
	}
}
