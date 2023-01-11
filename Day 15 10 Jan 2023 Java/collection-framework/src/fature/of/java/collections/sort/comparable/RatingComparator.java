package fature.of.java.collections.sort.comparable;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}

}
