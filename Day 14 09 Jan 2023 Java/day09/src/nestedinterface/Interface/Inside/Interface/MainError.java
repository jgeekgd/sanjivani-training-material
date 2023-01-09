package nestedinterface.Interface.Inside.Interface;

/**
 * 
 * error: illegal combination of modifiers: public and protected protected
 * interface Yes ^ 1 error
 *
 */
interface Test1 {
	public interface Yes { // protected interface Yes { --> The interface member type Yes can only be
							// public
		void show();
	}
}

class Testing1 implements Test1.Yes {
	public void show() {
		System.out.println("show method of interface");
	}
}

public class MainError {
	public static void main(String[] args) {
		Test1.Yes obj;
		Testing1 t = new Testing1();
		obj = t;
		obj.show();
	}
}
