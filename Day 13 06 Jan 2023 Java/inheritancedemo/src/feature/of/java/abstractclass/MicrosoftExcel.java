package feature.of.java.abstractclass;

public class MicrosoftExcel extends MicrosoftOffice  {
	public MicrosoftExcel() {
		super();
		splashScreen();
	}
	public void print() {
		System.out.println("Printing excel rows and columns....");
	}

	@Override
	public int sum(char type,int... nums) {
		int result=0;
		for(int currentValue: nums) {
			switch(type) {
			case 'E':
				if(currentValue%2==0) {
					result+=currentValue;
				}
				break;
			case 'O':
				if(currentValue%2!=0) {
					result+=currentValue;
				}
				break;
			default:
				result+=currentValue;
				break;
			}
		}
		return result;
	}
	@Override
	public void present() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void convertToPdf(String fileName) {
		// TODO Auto-generated method stub
		
	}
	
}
