package fature.of.java.collections.sort.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To summarize, if sorting of objects needs to be based on natural order then use Comparable whereas if you sorting needs to be done on attributes of different objects, then use Comparator in Java.
*/
public class ComporableDemo {

	public static void main(String[] args) {
		Movie spiderman = new Movie(8.9, "Spiderman - No way home", 2021);
		Movie avenger = new Movie(9.0, "Avenger End Game", 2019);
		Movie captainAmercia = new Movie(8.0, "The First Avenger", 2013);
		Movie bahubali2 = new Movie(9.0, "Bahubali Conclusion", 2019);
		
		ArrayList<Movie> marvelStudio = new ArrayList();
		marvelStudio.add(spiderman);
		marvelStudio.add(avenger);
		marvelStudio.add(captainAmercia);
		marvelStudio.add(bahubali2);
		spiderman = new Movie(8.9, "spiderman - No way home", 2021);
		marvelStudio.add(spiderman);
		System.out.println("Sorting by years");
		Collections.sort(marvelStudio); //Comparable is used since its implemented inside Movie class
		printAllMovies(marvelStudio);
		
		
		System.out.println("Sorting by ratings");
		Collections.sort(marvelStudio, new RatingComparator());  // Different comparison paramter
		printAllMovies(marvelStudio);

		System.out.println("Sorting by name");
		
		//Anonymous class usage example---
		Collections.sort(marvelStudio, new Comparator<Movie>() {

			@Override
			public int compare(Movie m1, Movie m2) {

				// the value 0 if the argument string is equal to this string; a value less than
				// 0 if this string is lexicographically less than the string argument; and a
				// value greater than 0 if this string is lexicographically greater than the
				// string argument.
				return m1.getName().compareTo(m2.getName());
			}

		});
		printAllMovies(marvelStudio);

		/*
		 * 1. 2021 2. spiderman.compareTo(avenger) 2021-2019 - +ve > 0 - implies object
		 * to be swapped 3. avenger.compareTo(captainAmerica) 2019-2013 -+v2 >0 -
		 * implies object to be swapped 4. captainAmerica.compareTo(bahubali2) 2013 -
		 * 2019 - -6 -ve -implies no swap needed
		 */
	}

	private static void printAllMovies(ArrayList<Movie> marvelStudio) {
		for (Movie movie : marvelStudio) {
			System.out.println(movie);
		}
	}

}

/*
 * Java provides two interfaces to sort objects using data members of the class:
 * 
 * 
 * Comparable Comparator
 * 
 * 
 * Using Comparable Interface
 * 
 * A comparable object is capable of comparing itself with another object. The
 * class itself must implements the java.lang.Comparable interface to compare
 * its instances. Consider a Movie class that has members like, rating, name,
 * year. Suppose we wish to sort a list of Movies based on year of release. We
 * can implement the Comparable interface with the Movie class, and we override
 * the method compareTo() of Comparable interface.
 *
 * Comparable is meant for objects with natural ordering which means the object
 * itself must know how it is to be ordered. For example Roll Numbers of
 * students. Whereas, Comparator interface sorting is done through a separate
 * class. Logically, Comparable interface compares �this� reference with the
 * object specified and Comparator in Java compares two different class objects
 * provided. If any class implements Comparable interface in Java then
 * collection of that object either List or Array can be sorted automatically by
 * using Collections.sort() or Arrays.sort() method and objects will be sorted
 * based on there natural order defined by CompareTo method. A basic
 * differentiating feature is that using comparable we can use only one
 * comparison. Whereas, we can write more than one custom comparators as you
 * want for a given type,all using different interpretations of what sorting
 * means. Like in the comparable example we could just sort by only one
 * attribute, i.e., year but in the comparator, we were able to use different
 * attributes like rating, name, and year as well.
 *
 */