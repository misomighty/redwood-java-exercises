public class Movie {
    private String name;
    private String category;

    Movie[] movies = MoviesArray.findAll();

    public Movie(String aName, String aCategory) {
        name = aName;
        category = aCategory;
    }

    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

}


