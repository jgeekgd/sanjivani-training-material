package nestedinterface.Interface.Inside.Interface;

/**
 * 
 * Interface in another Interface An interface can be declared inside another
 * interface also. We mention the interface as i_name1.i_name2 where i_name1 is
 * the name of the interface in which it is nested and i_name2 is the name of
 * the interface to be implemented.
 *
 */
interface Test {
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
