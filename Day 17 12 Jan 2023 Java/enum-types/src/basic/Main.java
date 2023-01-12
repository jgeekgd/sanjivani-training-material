package basic;

public class Main {

	public static void main(String[] args) {
		MenShirtSize iWantXL = MenShirtSize.XL;
		System.out.println("MenShirt.XL ===>" + iWantXL);

		if (iWantXL == MenShirtSize.XL) {
			System.out.println("For " + iWantXL + "  we have 10% Dicosunt.");
		}
		System.out.println("MenShirt.M ===>" + MenShirtSize.M);
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

	}
}