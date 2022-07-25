package application;

import entities.Movie;
import utilities.LinkedList;

public class App {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(new Movie("A", "description", "Action", 120, 3));
		list.add(new Movie("B", "description", "Fiction", 120, 5));
		list.add(new Movie("C", "description", "Terror", 120, 3));
		list.add(new Movie("D", "description", "Romance", 120, 6));
		list.add(new Movie("E", "description", "Romance", 120, 2));
		list.add(new Movie("F", "description", "Fiction", 120, 1));
		list.add(new Movie("G", "description", "Science", 120, 7));
	
		System.out.println(list.genreSearch("romance"));
		System.out.println("Average rating: " + list.getAverage());
		
	}
	
}
