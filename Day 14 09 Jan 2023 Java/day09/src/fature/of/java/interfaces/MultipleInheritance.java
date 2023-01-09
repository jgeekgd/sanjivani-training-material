package fature.of.java.interfaces;

public class MultipleInheritance {

	public static void main(String[] args) {
		ConcreateClass class1=new ConcreateClass();
		class1.m1();
		class1.m2();
		class1.m3();
		class1.m4();
		class1.m5();
	}
}

/*
 * 	 G
 *  / \ 
 *  A B 
 *  \ / 
 *   C 
 *   |
 *   D
 *   
 */	
interface G{
	void m1();
}

interface A extends G{
	
	void m2();
}
interface B extends G{
	void m3();
}

interface C extends A, B{
	void m4();
}

interface D extends C {
	void m5();
}

class ConcreateClass implements D{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

}