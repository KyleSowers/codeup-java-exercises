package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {


    public static void main(String[] args) {
        int userChoice;
        do {
            System.out.printf("What would you like to do? %n0 - exit %n1 - view all movies %n2 - view movies in the animated category %n3 - view movies in the drama category %n4 - view movies in the horror category %n5 - view movies in the scifi category%n");

//        Calling scanner from imported Input class
            Input input = new Input();

//        Calling on getter Method for user choice (switch)
            userChoice = input.getInt2();
            switch (userChoice) {
                case 1:
                    Movie[] allMovies = MoviesArray.findAll();
                    for (Movie movie : allMovies) {
                        System.out.println(movie.getName());
                    }
                    break;
                case 2:
                    Movie[] animatedMovies = MoviesArray.findAll();
                    for (Movie movie : animatedMovies) {
//                    System.out.println(movie.getCategory());
                        if (movie.getCategory().equals("animated")) {
//                        System.out.println((movie.getCategory()));
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 3:
                    Movie[] dramaMovies = MoviesArray.findAll();
                    for (Movie movie : dramaMovies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 4:
                    Movie[] horrorMovies = MoviesArray.findAll();
                    for (Movie movie : horrorMovies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;
                case 5:
                    Movie[] scifiMovies = MoviesArray.findAll();
                    for (Movie movie : scifiMovies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName());
                        }
                    }
                    break;

            }
        } while (userChoice >= 0 && userChoice <= 5);
    }
}
