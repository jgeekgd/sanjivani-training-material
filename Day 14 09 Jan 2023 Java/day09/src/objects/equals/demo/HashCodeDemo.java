package objects.equals.demo;

public class HashCodeDemo {
	public static void main(String[] args) {
		HashCodeDemo h1 = new HashCodeDemo();
		HashCodeDemo h2 = h1;
		HashCodeDemo h3 = h2;
		
		System.out.println("H1 Hex Address:" + Integer.toHexString(h1.hashCode()).toUpperCase());
		System.out.println("H2 Hex Address:" + Integer.toHexString(h2.hashCode()).toUpperCase());
		System.out.println("H3 Hex Address:" + Integer.toHexString(h3.hashCode()).toUpperCase());
		
		System.out.println("H1 Identity Hash Address:" +System.identityHashCode(h1));
		System.out.println("H2 Identity Hash Address:" +System.identityHashCode(h2));
		System.out.println("H3 Identity Hash Address:" +System.identityHashCode(h3));
		
		
		System.out.println(System.identityHashCode(new HashCodeDemo()));
		System.out.println(System.identityHashCode(new HashCodeDemo()));
		System.out.println(h1 == h2);
		System.out.println(h1.equals(h2));
		System.out.println(h2.equals(h1));

		System.out.println(h1 == h3);
		System.out.println(h1.equals(h3));
	}
}
