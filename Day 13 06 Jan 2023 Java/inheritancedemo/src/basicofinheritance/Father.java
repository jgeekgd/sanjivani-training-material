package basicofinheritance;

import com.revature.model.SimCard;

public class Father {
	protected String house; 
	private String bankBalance; 
	protected String car;
	public Father() {
	}
	public Father(String house, String bankBalance, String car) {
		this.house = house;
		this.bankBalance = bankBalance;
		this.car = car;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(String bankBalance) {
		this.bankBalance = bankBalance;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	
	public String displayFatherProperty() {
		return "Father [house=" + house + ", bankBalance=" + bankBalance + ", car=" + car + "]";
	}
	
	protected SimCard mangoTree() {
		System.out.println("Father - No Access to School Kids");
		return null;
	}
	
}
