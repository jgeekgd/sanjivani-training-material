package notmultithreaded.application;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		
		long beginTime=System.currentTimeMillis();
		System.out.println("START STOPWATCH: "+beginTime+" miliseconds");
		m1();
		m2();
		long endTime=System.currentTimeMillis();
		System.out.println("SRTOP STOPWATCH: "+System.currentTimeMillis()+" miliseconds");
		System.out.println("TOTAL TIME: "+ (endTime-beginTime)+" miliseconds");
	}

	public static void m1() {
		for (int i = 1; i < 123; i++) {
			System.out.println("m1():--->" + (char) i);
		}
	}

	private static void m2() {
		for (int i = 1; i < 123; i++) {
			System.out.println("m2():--->" + (char) i);
		}
	}

}
