package generic.style.advanced.wildcards;


import java.util.ArrayList;
import java.util.List;	

public class Impossible {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		//printList(intList);                                             //not possible as Integer is sub class of Object but List<Integer> is not subclass of List<Object>
	}

	private static void printList(List<Object> anyList) {
		System.out.println(anyList);
	}
}
