package feature.of.java.abstractclass;

public class MicrosoftPowePoint extends MicrosoftOffice  {
	public void print() {
		System.out.println("Printing PPT document....");
	}
	public MicrosoftPowePoint() {
		super();
		splashScreen();
	}

	@Override
	public void present() {
		System.out.println("Presenting slide 1,2,3..");
	}
	@Override
	public int sum(char type, int... nums) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void convertToPdf(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
