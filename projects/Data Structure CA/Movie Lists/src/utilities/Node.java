package utilities;

import entities.Movie;

public class Node {
	
	public Movie movie;
	public Node next;
	
	public Node(Movie movie) {
		this.movie = movie;
		this.next = null;
	}
	
}
