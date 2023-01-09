package objects.equals.demo;

/**
 * 
 * There is a difference between hashCode() and identityHashCode() returns. It
 * is possible that for two unequal (tested with ==) objects o1, o2 hashCode()
 * can be the same. See the example below how this is true.
 *
 */
public class SeeDifferences {
	public static void main(String[] args) {
		String s1 = "stackoverflow";
		String s2 = new String("stackoverflow");
		String s3 = "stackoverflow";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		if (s1 == s2) {
			System.out.println("s1 and s2 equal");
		} else {
			System.out.println("s1 and s2 not equal");
		}
		if (s1 == s3) {
			System.out.println("s1 and s3 equal");
		} else {
			System.out.println("s1 and s3 not equal");
		}
	}
}

/**
 * 
 * Default hashCode method when not overridden give unique values but those are
 * not found post overriding hence we need custom strategy to override uniquness
 * 
 * https://stackoverflow.com/questions/909843/how-to-get-the-unique-id-of-an-object-which-overrides-hashcode
 * 
 * hashCode() method is not for providing a unique identifier for an object. It
 * rather digests the object's state (i.e. values of member fields) to a single
 * integer. This value is mostly used by some hash based data structures like
 * maps and sets to effectively store and retrieve objects.
 * 
 * If you need an identifier for your objects, I recommend you to add your own
 * method instead of overriding hashCode.
 * 
 */
