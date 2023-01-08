package feature.of.java.abstractclass;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MicrosoftWord extends MicrosoftOffice {
	public MicrosoftWord() {
		super();
		splashScreen();
	}

	public void print() {
		System.out.println("Printing word document....");
	}
	
	@Override
	public void convertToPdf(String fileName) {
		 //Converted Resume.docx to Resume.pdf
		 
		 int afterThisTruncateAll=fileName.indexOf(".");
		 String actualFileNameWithoutExtension=fileName.substring(0,6);
		 
		System.out.println("Converted "+fileName+" to "+actualFileNameWithoutExtension+".pdf");
		
		
	}

	@Override
	public int sum(char type, int... nums) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void present() {
		// TODO Auto-generated method stub
		
	}

}
