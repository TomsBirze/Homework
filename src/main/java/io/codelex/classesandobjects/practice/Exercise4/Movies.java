package io.codelex.classesandobjects.practice.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    public static void main(String[] args) {
        Movie casinoRoyal = new Movie("Casino Royal", "Eon Productions", "PG13");
        Movie glass = new Movie("Glass", "Buena Vista International", "PG13");
        Movie spiderMan = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] movies = new Movie[]{casinoRoyal, glass, spiderMan};
        Movie[] pgMovies = getPG(movies);

        for (Movie movie : pgMovies) {
            System.out.println(movie.getTitle());
        }
    }

    public static Movie[] getPG(Movie[] movies) {
        List<Movie> pgMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if ("PG".equals(movie.getRating())) {
                pgMovies.add(movie);
            }
        }
        return pgMovies.toArray(new Movie[0]);
    }
}

