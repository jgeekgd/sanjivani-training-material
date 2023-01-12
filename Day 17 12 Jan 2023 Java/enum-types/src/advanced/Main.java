package advanced;

public class Main {

	public static void main(String[] args) {
		// MenShirt.XL.inches=120; error  
		System.out.println("MenShirt.XL   ===>" + MenShirtSize.XL);
		System.out.println("MenShirt.M.inches ===>" + MenShirtSize.M.getInches());
		// System.out.println(MenShirt.values());
		for (MenShirtSize val : MenShirtSize.values()) {
			System.out.println(val);
		}
		MenShirtSize[] allSizes = MenShirtSize.values();
		System.out.println(allSizes[0]);
		System.out.println(allSizes[1]);
		System.out.println(allSizes[2]);
		System.out.println(allSizes[3]);
		System.out.println(allSizes[4]);
		System.out.println(allSizes[5]);
		System.out.println(allSizes[6]);

		MenShirtSize value = MenShirtSize.XXXL;
		switch (value) {
		case S:
		case M:
		case L:
		case XL:
			System.out.println("5% Dicosunt");
			break;
		case XXL:
		case XXXL:
		case XXXXL:
			System.out.println("10% Dicosunt");
			break;
		}

		int inches = 12;// MenShirt.L.inches;
		switch (inches) {
		//case MenShirtSize.M.getInches(): sine variable not allowed 
		case 40:
		case 42:
		case 44:
			System.out.println("5% Dicosunt");
			break;
		case 46:
		case 48:
		case 50:
			System.out.println("10% Dicosunt");
			break;
		default:
			System.out.println("2% Dicosunt");

		}

	}
}