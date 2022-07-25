package utilities;

import entities.Movie;

public class LinkedList {

	public Node first, last;

	public LinkedList() {
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}

		return false;
	}

	public void add(Movie movie) {
		if (isEmpty()) {
			first = new Node(movie);
			last = first;
			return;
		}

		last.next = new Node(movie);
		last = last.next;
	}
	
	public double getAverage() {
		double size = 0.0;
		double total = 0.0;
		Node current = first;
		
		while(current != null) {
			size++;
			total += current.movie.getRating();
			current = current.next;
		}
		
		return (total / size);
	}
	
	public String genreSearch(String genre) {
		String aux = "";
		aux += "----------------------------------\n";
		Node current = first;
		
		while(current != null) {
			if(current.movie.getGenre().equalsIgnoreCase(genre)) {
				aux += current.movie.toString();
				aux += "----------------------------------\n";
			}
			current = current.next;
		}
		
		return aux;
	}

	public void remove(String title) {
		Node current = first;
		Node toRemove = null;

		while (current != null) {
			if (current.movie.getTitle().equals(title)) {
				toRemove = current;
				break;
			}
			current = current.next;
		}

		if (toRemove == null) {
			System.out.println("Cannot find the movie!");
			return;
		}
		
		// resetando o no que percorre
		current = first;

		if (toRemove == first) {
			first = first.next;
		} else {
			while (current.next != toRemove) {
				current = current.next;
			}

			if (toRemove == last) {
				last = current;
				last.next = null;
			} else { 
				current.next = current.next.next;
			}
		}

	}

	public void print() {
		Node current = first;

		while (current != null) {
			System.out.println(current.movie);
			current = current.next;
		}
	}
}
