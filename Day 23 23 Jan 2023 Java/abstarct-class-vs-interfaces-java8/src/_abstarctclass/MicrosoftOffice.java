package _abstarctclass;

public abstract class MicrosoftOffice {
	private int privateNormalVariable = 10;
	public final String FINAL_VARIABLE = "14% Studeet Discount";
	public static long staticVariable = 2300000L;

	public MicrosoftOffice(int privateNormalVariable) {
		super();
		this.privateNormalVariable = privateNormalVariable;
	}

	public MicrosoftOffice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void staticMethod() {
		System.out.println(staticVariable);
	}

	public final void finalMethod() {
		System.out.println(FINAL_VARIABLE);
	}

	public abstract void abstractMethod();

	public static void main(String[] args) {
		// MicrosoftOffice office2050 = new MicrosoftOffice();
	}


}
