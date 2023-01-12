package advanced;

/**
 * Enumeration - the action of mentioning a number of things one by one.
 * 
 *
 */

public enum MenShirtSize {
	S(38), 
	M(40), 
	L(42),
	XL(44), 
	XXL(46), 
	XXXL(48), 
	XXXXL(50); // End with semicolon also if you dont mention value it will give compilation error as we have constructor defined with value.

	private final int inches;  //usually we keep values final so that they are not modifiable from outside via setter or add possible modifier like private.
	MenShirtSize(int inches) {
		this.inches = inches;
	}
	public int getInches() {
		return this.inches;
	}
}
