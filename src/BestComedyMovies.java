import java.util.Arrays;
import java.util.Iterator;

public class BestComedyMovies implements MovieIterator {
	
	MovieInfo[] bestMovies;
	
	int arrayValue = 0;
	
	public BestComedyMovies() {
		
		bestMovies = new MovieInfo[4];
		
		addMovie("Dazed and Confused", 1993);
		addMovie("Ace Ventura", 1993);
		addMovie("Idiocracy", 2006);
		addMovie("Shaun of the Dead", 2004);
		
	}
	
	public void addMovie(String movieName, int yearReleased) {
		MovieInfo movie = new MovieInfo(movieName, yearReleased);
		bestMovies[arrayValue] = movie;
		arrayValue++;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(bestMovies).iterator();
	}
	


}
