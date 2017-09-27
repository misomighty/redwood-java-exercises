package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();


        do {
            int option = input.getInt(0, 5);
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
                    addMovie();

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

//    public static void addMovie(Input input, String newTitle, String newCategory, Movie[] movies) {
//        newTitle = input.getString("Enter a title: ");
//        newCategory = input.getString("Enter a category: ");
//
//       Movie[] Arrays.copyOf(movies, movies.length+1);
//
//    }
}

