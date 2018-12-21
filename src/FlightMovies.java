import java.util.ArrayList;
import java.util.Collections;

/*Prompt: Flight have movies and people never have time to finish the second one 
they start to watch. From the movies on the plane, is their a pair of movies that, 
when watched together, will eaual the total time of the flight?*/

public class FlightMovies {
	public static void main(String[] args) {
		
		FlightMovies flight = new FlightMovies();
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		movies.add(new Movie("one", 60));
		movies.add(new Movie("two", 40)); 
		movies.add(new Movie("three", 90));
		movies.add(new Movie("four", 90));
		
		System.out.println(flight.movieCombination(120, movies)); 
		
	}
	
	boolean movieCombination(int flightTime, ArrayList<Movie> movies) {
		
		for(Movie m : movies) {
			int secondMovieTime = flightTime - m.getTime();
			System.out.println(secondMovieTime);
			System.out.println(m.getTime());
			for(Movie m2 : movies) {
				if(m2.getTime() == secondMovieTime) {
					if(m2.getName().equals(m.getName())) {
						
					}else {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	//TO DO: sorting array to mind perfect flight combination 
	boolean movieCombos(int flightTime, ArrayList<Movie> movies) {
		
		for (int i = 0; i < movies.size()-1; i++) {
			
			if(movies.get(i).compareTo(movies.get(i+1)) > 0) {
				
			}else if(movies.get(i).compareTo(movies.get(i+1)) < 0) {
				
			}
		
		}
		
		for (int i = 0; i < array.length; i++) {
			
		}
		
		return false;
	}
}


