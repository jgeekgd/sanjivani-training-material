package feature.of.java.abstractclass;

// Abstarct Class can have zero... all... few abstract methods.
// If you make any single method in concreate class as abstract you need
// to make class abstract
public abstract class MicrosoftOffice {
	public String softwareName="MS Office 365";
	public abstract void print();
	public abstract int sum(char type,int... nums) ;
	public abstract void present();
	public abstract void convertToPdf(String fileName);
		
	public void splashScreen() {
		System.out.println("Welcome to "+softwareName+" !");
	}
		
 
}
