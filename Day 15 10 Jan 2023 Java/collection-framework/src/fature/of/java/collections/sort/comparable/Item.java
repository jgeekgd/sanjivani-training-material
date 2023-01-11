package fature.of.java.collections.sort.comparable;

public class Item {
	private String itemName;
	private double itemPrice;
	private String itemSize;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String itemName, double itemPrice, String itemSize) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemSize = itemSize;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemSize() {
		return itemSize;
	}

	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemSize=" + itemSize + "]";
	}

}