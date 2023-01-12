package basic;

public enum MenShirtSize { // extends Enum --> by defualt all enum extends from java.lang.Enum class  https://docs.oracle.com/javase/8/docs/api/java/lang/Enum.html
	S, M, L, XL, XXL, XXXL, XXXXL; // End with semicolon
}

//Because enum extends from Enum class you have few ready to use methods like values()
//values() return all values. 