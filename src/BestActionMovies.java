import java.util.ArrayList;
import java.util.Iterator;


public class BestActionMovies implements MovieIterator {

	ArrayList <MovieInfo> bestMovies;
	
	public BestActionMovies() {
		
		bestMovies = new ArrayList<MovieInfo>();
		
		addMovie("Terminator 2", 1991);
		addMovie("Die Hard", 1988);
		addMovie("John Wick", 2014);
		addMovie("Skyfall", 2012);
		
	}
	
	public void addMovie(String movieName, int yearReleased) {
		MovieInfo movieInfo = new MovieInfo(movieName, yearReleased);
		bestMovies.add(movieInfo);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return bestMovies.iterator();
	}
}
