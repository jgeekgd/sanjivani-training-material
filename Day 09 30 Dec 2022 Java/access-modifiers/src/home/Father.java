package home;

public class Father {
	// Member variables
	public String mangoTree;
	private String secuityLocker; 
	private String smartTV;
	protected String car;
	String mixerGrinder;// when no access modifier its termed as default access modifier, avoid default, to be shared in same packge
	
	public static String commonSofa="Durian Sofa";
	public static String commonWashingMachine="Samsung 8Kg";
	public static String commonTV="Philips 32inch TV";

	
	public static void payingGuest1() {
	 	System.out.println(commonSofa);
	 	System.out.println(commonSofa);
	 	
	 	Father mrRoy= new Father();
	 	System.out.println(mrRoy.car);
	 	
	}
	
	public static void payingGuest2() {
	 	System.out.println(commonSofa);
	 	System.out.println(commonSofa);
	}
	
	public void wife() {
		System.out.println(commonSofa);
	 	System.out.println(commonTV);
	 	System.out.println(secuityLocker);
	}
	
	public void setMangoTree(String whichMango) {
		this.mangoTree = whichMango; // Initializing Instance variable
	}

	public String getMangoTree() {
		return this.mangoTree; // Instance variable
	}

	public void setSmartTv(String sm) {
		this.smartTV = sm; // Initializing Instance variable
	}

	public String getSmartTV() {
		return this.smartTV; // Instance variable
	}

	public void setCar(String carName) {
		this.car = carName; // Instance variable
	}

	public String getCar() {
		return this.car; // Instance variable
	}

}
