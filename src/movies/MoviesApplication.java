public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        viewAll(movies);
        }

    public static String viewAll(Movie[] movies) {
        String movieListItem = "";
        for(Movie movie : movies) {
            return movieListItem = "Title: " + movie.getName() + " Category: " + movie.getCategory();
        }
        return movieListItem;
    }
    }

