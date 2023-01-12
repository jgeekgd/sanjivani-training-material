package more.advanced;

public class Main {

	public static void main(String[] args) {
		System.out.println("MenShirt.XL.price   ===>" + MenShirtSize.XL.price);
		System.out.println("MenShirt.M.getInches() ===>" + MenShirtSize.M.getInches());
		
		for (MenShirtSize val : MenShirtSize.values()) {
			System.out.println(val);
		}
		MenShirtSize[] allSizes = MenShirtSize.values();
		System.out.println(allSizes[0].price);
		System.out.println(allSizes[1].price);
		System.out.println(allSizes[2].price);
		System.out.println(allSizes[3].getPrice());
		System.out.println(allSizes[4].getPrice());
		System.out.println(allSizes[5].getPrice());
		System.out.println(allSizes[6].getPrice());

		MenShirtSize value = MenShirtSize.XXXL;
		switch (value) {
		case S:
		case M:
		case L:
		case XL:
			System.out.println("5% Discount for Size: "+value);
			break;
		case XXL:
		case XXXL:
		case XXXXL:
			System.out.println("10% Discount for Size: "+value);
			break;
		}

		int inches = 12;// MenShirt.L.inches;
		switch (inches) {
		case 38:
		case 40:
		case 42:
		case 44:
			System.out.println("5% Discount for Size: "+value.searchSizeByInches(inches));
			break;
		case 46:
		case 48:
		case 50:
			System.out.println("10% Discount for Size: "+value.searchSizeByInches(inches));
			break;
		default:
			System.out.println("2% Discount for Size: "+value.searchSizeByInches(inches));

		}

	}
}