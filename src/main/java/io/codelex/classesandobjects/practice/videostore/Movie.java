package io.codelex.classesandobjects.practice.videostore;

public class Movie {
    private String name;
    private int rating;
    private boolean checkedOut;

    public Movie(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.checkedOut = false;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}
