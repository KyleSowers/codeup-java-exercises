package movies;

public class Movie {

//    Fields
    private String name;
    private String category;

//    Constructor
    public Movie(String movieName, String movieCategory) {
        name = movieName;
        category = movieCategory;
    }

//    Methods

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

}
