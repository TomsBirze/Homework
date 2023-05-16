package io.codelex.classesandobjects.practice.Exercise4;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
    }

//    public Movie[] getPG(Movie[] movies) {
//        List<Movie> pgMovies = new ArrayList<>();
//        for (Movie movie : movies) {
//            if ("PG".equals(movie.rating)) {
//                pgMovies.add(movie);
//            }
//        }
//        return pgMovies.toArray(new Movie[0]);
//    }
}
