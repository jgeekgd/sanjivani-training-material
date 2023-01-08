package basicofinheritance;

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

}
