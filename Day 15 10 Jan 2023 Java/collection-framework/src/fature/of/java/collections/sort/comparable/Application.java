package fature.of.java.collections.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Application {
	public static void main(String[] args) {

		Item pizza = new Item("Cheese Pizza", 300.00, "Extra Large");
		Item coldDrink = new Item("Sprite", 56.00, "2Ltr");
		Item cookie = new Item("Karachi Cookies", 800.00, "2Kg");
		Item juice = new Item("Mango Juice", 230.00, "1Ltr");
		Item fruit= new Item("Apple", 290.00, "1Kg");

		treeSetAutomaticSorting(pizza, coldDrink, cookie, juice, fruit);
		
		//arraylistSorting(pizza, coldDrink, cookie, juice, fruit);

	}

	private static void treeSetAutomaticSorting(Item pizza, Item coldDrink, Item cookie, Item juice, Item fruit) {
		TreeSet<Item> shoppingCart= new TreeSet<Item>( new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				return o1.getItemName().compareTo(o2.getItemName());
			}
		});
		
		shoppingCart.add(pizza);
		shoppingCart.add(coldDrink);
		shoppingCart.add(cookie);
		shoppingCart.add(juice);
		shoppingCart.add(fruit);

		System.out.println("Automatic Sorting Becuase we are using Tree Set:");
		for (Item val : shoppingCart) {
			System.out.println(val);
		}
	}

	private static void arraylistSorting(Item pizza, Item coldDrink, Item cookie, Item juice, Item fruit) {
		List<Item> shoppingCart = new ArrayList<Item>();
		shoppingCart.add(pizza);
		shoppingCart.add(coldDrink);
		shoppingCart.add(cookie);
		shoppingCart.add(juice);
		shoppingCart.add(fruit);

		System.out.println("Before Sorting");
		for (Item val : shoppingCart) {
			System.out.println(val);
		}

		//sortByPrice(shoppingCart);
		//sortByItemName(shoppingCart);

		
		System.out.println("After Sorting");
		for (Item val : shoppingCart) {
			System.out.println(val);
		}
	}

	private static void sortByItemName(List<Item> shoppingCart) {
		Collections.sort(shoppingCart, new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				return o1.getItemName().compareTo(o2.getItemName());
			}
		});
	}

	private static void sortByPrice(List<Item> shoppingCart) {
		Collections.sort(shoppingCart, new Comparator<Item>() {
			@Override
			public int compare(Item i1, Item i2) {
				return ((int) i1.getItemPrice()) - ((int) i2.getItemPrice());
			}
		});
	}
}
