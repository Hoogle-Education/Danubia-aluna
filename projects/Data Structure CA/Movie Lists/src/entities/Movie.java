package entities;

public class Movie {
	
	// atributos
	private String title;
	private String description;
	private String genre;
	private int duration;
	private int rating;
	
	// construtor(es)
	public Movie() {
	}
	
	public Movie(String title, String description, String genre, int duration, int rating) {
		this.title = title;
		this.description = description;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
	}

	// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		if(rating >= 1 && rating <= 5) {
			this.rating = rating;			
		}
	}

	@Override
	public String toString() {
		
		String aux = title + "\n";
		
		aux += "Description: " + description + "\n";
		aux += "Genre: " + genre + "\n";
		aux += "Duration: " + duration + "\n";
		aux += "Rating: " + rating + "\n";
		
		return aux; 
	}
	
	
	
}
