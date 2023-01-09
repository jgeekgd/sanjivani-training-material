package innerclasses.Method.Local.Inner.Class;

public class Main2 {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		Main2 obj = new Main2();
		obj.display();
	}
}