package constructors;

public class Main {

	public static void main(String[] args) {

		User superAdmin = new User('A');
		//superAdmin = new User();
		System.out.println(superAdmin.getUsername());
		System.out.println(superAdmin.getPassword());
		System.out.println(superAdmin.getGender());
		if(superAdmin.getUsername()=='\u0000' )
		{
			System.out.println("Space");
		}
		else
			System.out.println("No-Space");
		//homeWork();

		// oldSchool();

	}

	private static void homeWork() {
		User superAdmin = new User();
		System.out.println(12.12+12.12f);
		float val=superAdmin.getUsername();
		if(val==(float)0.00000000000) {
			System.out.println(val);
		}
		if(val==0.0f) {
			System.out.println(val);
		}
		if(val==0.0d) {
			System.out.println(val);
		}
		System.out.println(superAdmin.getPassword());
	}

	private static void oldSchool() {
		User admin = new User();
		// Mutator
//		admin.setUsername("Administrator");
//		admin.setPassword("passw0rd");

		// Accessor
		System.out.println(admin.getUsername());
		System.out.println(admin.getPassword());
	}

}
