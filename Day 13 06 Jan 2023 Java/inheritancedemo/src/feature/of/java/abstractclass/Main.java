package feature.of.java.abstractclass;

public class Main {

	public static void main(String[] args) {
		MicrosoftOffice microsoftOffice;

		MicrosoftWord document = new MicrosoftWord();
		// document.convertToPdf("Resume.docx");

		MicrosoftExcel spreadSheet = new MicrosoftExcel();
		//System.out.println("Calcualted Sum of given numbers-"+spreadSheet.sum('\u0000', new int[] {1,2,3,45,6,7,8,9}));

		MicrosoftPowePoint myProjectDemoSlide = new MicrosoftPowePoint();
		//myProjectDemoSlide.present();

		anyDocument(document);
		anyDocument(spreadSheet);
		anyDocument(myProjectDemoSlide);

	}

	public static void anyDocument(MicrosoftOffice doc) {
		
		if(doc instanceof MicrosoftWord)
		{
			System.out.println("I Got Word Document");
			doc.convertToPdf(" Resume.pdf");
		}
		
		if(doc instanceof MicrosoftExcel) 
		{
				System.out.println("I Got Excel Document");
				doc.sum('\u0000', new int[] {1,2,3,45,6,7,8,9});	
		}
		
		if(doc instanceof MicrosoftPowePoint) {
			System.out.println("I Got PPT Document");
			doc.present();
		}
		
	}
		
	
}
