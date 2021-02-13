import java.util.Iterator;


public class MovieQueue {
	
	BestActionMovies moviesAction;
	BestComedyMovies moviesComedy;
	
	MovieIterator iterMoviesAction;
	MovieIterator iterMoviesComedy;
	
	public MovieQueue(MovieIterator newMoviesAction, MovieIterator newMoviesComedy) {
		
		iterMoviesAction = newMoviesAction;
		iterMoviesComedy = newMoviesComedy;
	}

	public void showMovies() {
	
		Iterator moviesAction = iterMoviesAction.createIterator();
		Iterator moviesComedy = iterMoviesComedy.createIterator();
		
		System.out.println("Best Action Movies\n");
		printTheMovies(moviesAction);
		
		System.out.println("Best Comedy Movies\n");
		printTheMovies(moviesComedy);
	
	}
	
	public void printTheMovies(Iterator iterator) {
		while(iterator.hasNext()) {
			MovieInfo movieInfo = (MovieInfo) iterator.next();
			
			System.out.println(movieInfo.getMovieName());
			System.out.println(movieInfo.getYearReleased() + "\n");
		}
	}
	
}
