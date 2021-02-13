
public class MovieInfo {
	
	String movieName;
	int yearReleased;
	
	public MovieInfo(String newMovieName, int newYearReleased) {
		
		movieName = newMovieName;
		yearReleased = newYearReleased;
		
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public int getYearReleased() {
		return yearReleased;
	}

}
