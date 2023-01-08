package basicofinheritance;

import com.revature.model.Airtel;

public class Son extends Father {

	private String education;
	private String business;
	private String bike;

	public Son() {
	}

	public Son(String house, String bankBalance, String car, String education, String business, String bike) {
		super(house, bankBalance, car);
		this.education = education;
		this.business = business;
		this.bike = bike;
	}

	public String displaySonProperty() {
		return displayFatherProperty()+"\n"+"Son [education=" + education + ", business=" + business + ", bike=" + bike + "]";
	}

	//Rules of Overriding
	//1. Access modifers must be wider accessiblity not narrow
	//2. Static methods canot be overridden.
	//  2.1 Static members are accessible using directly method name or using super.methodName();
	//  2.2 Static methods though are passed to child class they are not overridable - this is also called as Methods hiding
	//3. final methods cannot/must not be overidden bcz final means final...
	//4. Return type form void to String - "non compatible types" will give error -The return type is incompatible with Father.mangoTree()
	//  4.1. Coverient return types allowed in overrridern e.g parent method return Animal child method post overridening retrun Dog.
	//       GranFather-->Father-->Son-->GrandSon
	//5. Method signature must be same
	
	@Override
	public Airtel mangoTree() {
		//super.mangoTree();  -- access possible if static
		//mangoTree(); -- access possible if static
		System.out.println("Son- Let School Kids Eat Mangos");
		return null;
	}
}
