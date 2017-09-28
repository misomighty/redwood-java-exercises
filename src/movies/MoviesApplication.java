package movies;
import util.Input;
import java.util.Scanner;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();


        do {
            int option = input.getInt(0, 6);
            switch (option) {
                case 0:
                    System.out.println("Exiting");
                    break;
                case 1:
                    viewMovies("", movies);
                    break;
                case 2:
                    viewMovies("animated", movies);
                    break;
                case 3:
                    viewMovies("drama", movies);
                    break;
                case 4:
                    viewMovies("horror", movies);
                    break;
                case 5:
                    viewMovies("scifi", movies);
                    break;
                case 6:
                    movies = addMovie(input, movies);
                    break;

            }

        }  while (input.yesNo("Would you like to continue?: [y/n]"));
    }


    

    public static void viewMovies(String category, Movie[] movies) {
        for (Movie movie : movies) {
            if(category.equalsIgnoreCase(movie.getCategory())) {
                System.out.println(movie.getName());
            } else if(category.isEmpty()) {
                System.out.println(movie.getName() + " ||||||||||| " + movie.getCategory());
            }
        }
    }

    public static Movie[] addMovie(Input input, Movie[] movies) {
        String newTitle = input.getString("Enter a title: ");
        String newCategory = input.getString("Enter a category: ");
        movies = Arrays.copyOf(movies, movies.length+1);
        movies[movies.length-1] = new Movie(newTitle, newCategory);
        return movies;

    }
}

