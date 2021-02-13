
public class AmazonPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BestActionMovies moviesAction = new BestActionMovies();
		BestComedyMovies moviesComedy = new BestComedyMovies();
		
		MovieQueue tonyG = new MovieQueue(moviesAction, moviesComedy);
		
		tonyG.showMovies();
	}

}
