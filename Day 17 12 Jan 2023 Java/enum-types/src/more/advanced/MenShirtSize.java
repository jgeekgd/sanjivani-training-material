package more.advanced;

/**
 * Enumeration - the action of mentioning a number of things one by one.
 * 
 *
 */

public enum MenShirtSize {
	S(38, 430.00), 
	M(40, 500.00), 
	L(42, 650.00),
	XL(44, 860.00), 
	XXL(46, 900.00), 
	XXXL(48, 980.00), 
	XXXXL(50, 1100.00),
	UNKNOWN(00, 00.00); // End with semicolon also if you dont mention value it will give compilation error as we have constructor defined with value.

	private final int inches;  //usually we keep values final so that they are not modifiable from outside via setter or add possible modifier like private.
	final double price; 
	MenShirtSize(int inches, double price) {
		this.inches = inches;
		this.price=price;
	}
	public int getInches() {
		return this.inches;
	}
	public double getPrice() {
		return this.price;
	}
	
	public static final MenShirtSize searchSizeByInches(int inches)
    {
     for(MenShirtSize value : MenShirtSize.values())
     {
        if(value.getInches() == inches)
            return value;
     }
     return MenShirtSize.UNKNOWN;
    }
}
