package _06.java8.lambadas.complex.example;

public class Main {

	public static void main(String[] args) {

		Passport emp1= new Employee();
		emp1.isValidPassport("G34343FG", "02/2023");
		emp1.isValidPassport("FYH2323G", "02/2021");
		

		//Anonymous class in java.
		//You dont create class and implement interface and override method
		//You directly create class without name, override method and assign to interface/abstract class.
		/* AbstractClass/Interface object = AbstractClass()/Interface(){
		 * @Override  
		 * anyAbstractMethod(){ 
		 * body goes here
		 * }
		 * };
		*/
		
		
		new Passport() {
		 @Override
			public boolean isValidPassport(String passportNumber, String passportExpiryDate) {
			 System.out.println("Student Passport Validation For Higher Studies");

			 System.out.println("Passport Number recevied for validation:" + passportNumber);

				if (originCountry().equals("INDIA")) {
					String extractedYear = passportExpiryDate.substring(3, passportExpiryDate.length());
					int year = Integer.parseInt(extractedYear);
					System.out.println("Country is:" + originCountry());
					System.out.println("Passport Date is:" + passportExpiryDate);

					int currentYearInInt = Integer.parseInt(Passport.getCurrentYear());
					if (year > currentYearInInt) {
						System.out.println("Passport Is Valid");
						return true;
					}
					System.out.println("Passport Is InValid");
					return false;
				} else {
					System.out.println("Country is:" + originCountry());
					System.out.println("Passport Date is:" + passportExpiryDate);
					System.out.println("Passport Is InValid");
					return false;
				}

			}
		}.isValidPassport("SD0010","12/2034");
		
		
		Passport tour1= new Passport() {
			 @Override
			 public boolean isValidPassport(String passportNumber, String passportExpiryDate) {
				 
			 System.out.println("Touriset Passport Validation");
			 System.out.println("Passport Number recevied for validation:" + passportNumber);

				if (originCountry().equals("INDIA")) {
					String extractedYear = passportExpiryDate.substring(3, passportExpiryDate.length());
					int year = Integer.parseInt(extractedYear);
					System.out.println("Country is:" + originCountry());
					System.out.println("Passport Date is:" + passportExpiryDate);

					int currentYearInInt = Integer.parseInt(Passport.getCurrentYear());
					if (year > currentYearInInt) {
						System.out.println("Passport Is Valid");
						return true;
					}
					System.out.println("Passport Is InValid");
					return false;
				} else {
					System.out.println("Country is:" + originCountry());
					System.out.println("Passport Date is:" + passportExpiryDate);
					System.out.println("Passport Is InValid");
					return false;
				}

			}
		};
		
		tour1.isValidPassport("TS02323", "06/2044");
		
	}

}
