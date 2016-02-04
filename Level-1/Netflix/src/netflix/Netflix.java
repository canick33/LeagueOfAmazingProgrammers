package netflix;

import java.util.ArrayList;

public class Netflix {

	public static void main(String[] args) {
		
		//1. Instantiate some Movie objects (at least 5).
		/* Create a movie array to store the movies */
		ArrayList<Movie> myMovies = new ArrayList<Movie>();
		/* Add some good movies */
		myMovies.add(new Movie("The Godfather", 5));
		myMovies.add(new Movie("The Shawshank Redemption", 5));
		myMovies.add(new Movie("Schindler's List", 5));
		myMovies.add(new Movie("Raging Bull", 5));
		myMovies.add(new Movie("Casablanca", 5));
		myMovies.add(new Movie("The Twilight Saga", 1));
		myMovies.add(new Movie("Batman and Robin", 1));
		myMovies.add(new Movie("Catwoman", 1));
		myMovies.add(new Movie("Spider-Man 3", 1));
		myMovies.add(new Movie("Last Airbender", 1));
		myMovies.add(new Movie("Thor", 3));
		myMovies.add(new Movie("ted", 3));
		myMovies.add(new Movie("World War Z", 3));
		
		//2. Use the Movie class to get the ticket price of one of your movies.
		System.out.println("The ticket price for: '" + myMovies.get(1).getTitle() +
				"' is " + myMovies.get(1).getTicketPrice());
		System.out.println("The ticket price for: '" + myMovies.get(5).getTitle() +
				"' is " + myMovies.get(5).getTicketPrice());
		System.out.println("The ticket price for: '" + myMovies.get(8).getTitle() +
				"' is " + myMovies.get(8).getTicketPrice());
		System.out.println();

		//3. Instantiate a NetflixQueue.
		NetflixQueue myNetflixQueue = new NetflixQueue();
		
		//4. Add your movies to the Netflix queue.
		/* Loop thru the my Movies */
		for (int i=0; i<myMovies.size(); i++) {
			/* Add the next movie from my movies to the netflix queue */
			myNetflixQueue.addMovie(myMovies.get(i));
		}
		//5. Print all the movies in your queue.
		System.out.println("My Movies (unsorted)");
		myNetflixQueue.printMovies();
		System.out.println();
		/* Sort the movies by rating */
		myNetflixQueue.sortMoviesByRating();
		System.out.println("My Movies (sorted by rating)");
		myNetflixQueue.printMovies();
		System.out.println();
		
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		System.out.println("The best movie is: " + myNetflixQueue.getBestMovie().getTitle());
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
		System.out.println("The second best movie is: " + myNetflixQueue.getMovie(1).getTitle());


	}

}
