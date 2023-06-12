package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private final String title;
    private final int rating;
    private int ratingCount;
    private int totalRating;
    private boolean isCheckedOut;

    public Video(String title, int rating) {
        this.title = title;
        this.rating = rating;
        this.ratingCount = 0;
        this.totalRating = 0;
        this.isCheckedOut = false;
    }

    public void receiveRating(int rating) {
        this.ratingCount++;
        this.totalRating += rating;
    }

    public void checkedOut() {
        this.isCheckedOut = true;
    }

    public void returnVideo() {
        this.isCheckedOut = false;
    }

    public double getAverageRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return (double) totalRating / (double) ratingCount;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", averageRating=" + getAverageRating() +
                '}';
    }
}

