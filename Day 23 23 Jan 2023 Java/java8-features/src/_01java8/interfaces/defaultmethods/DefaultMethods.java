package _01java8.interfaces.defaultmethods;

public class DefaultMethods {

	public static void main(String[] args) {

		Usb port1 = new iPhone();
		System.out.println("My new port speed:" + port1.increaseSpeed());
		// Below now allowed as the static methods are not passed to
		// implementing classes of interfaces.
		// port1.security();

		// You must use interface name and static member instead
		Usb.security();

		WdHardDrive drive = new WdHardDrive();

		// Below now allowed as the static methods are not passed to
		// implementing classes of interfaces.
		// drive.security();
		System.out.println("My drive speed:" + drive.increaseSpeed());
	

	}

}

interface Usb {
	static final String SPEED_MAX = "20Mbps";

	void charge();

	Object read();

	boolean write(Object toBeSent);

	// Only interfaces can have default methods
	default String increaseSpeed() {
		return "300Mbps";
	}

	static String security() {
		return "Security Applied";
	}
}

/*
 * Default methods not allowed inside abstact class
 * 
 * abstract class Gd{ default boolean faceDetection() {
 * 
 * return true; } }
 */

class iPhone implements Usb {

	/*
	 * Default methods not allowed inside concreate class
	 * 
	 * default boolean faceDetection() {
	 * 
	 * return true; }
	 */
	@Override
	public String increaseSpeed() {
		return "1200Mbps";
	}

	@Override
	public void charge() {
		System.out.println("Charging iPhone");

	}

	@Override
	public Object read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean write(Object toBeSent) {
		// TODO Auto-generated method stub
		return false;
	}
}

class WdHardDrive implements Usb {

	@Override
	public void charge() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object read() {
		return "All files on my WD Hard Drive";
	}

	@Override
	public boolean write(Object toBeSent) {
		System.out.println("Send my project to WD Hard Drive");
		return true;
	}

}