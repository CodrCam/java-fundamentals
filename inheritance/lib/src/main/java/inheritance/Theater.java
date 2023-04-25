package main.java.inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class Theater implements Reviewable {
    private String name;
    private Set<String> movies;
    private List<Review> reviews;
    private int stars;

    public Theater(String name) {
        this.name = name;
        this.movies = new HashSet<>();
        this.reviews = new ArrayList<>();
        this.stars = 0;
    }

    public String getName() {
        return name;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public Set<String> getMovies() {
        return movies;
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    @Override
    public void addReview(Review review) {
        if (review.getSubject() != this && !reviews.contains(review) && review.getAuthor().addReview(review)) {
            reviews.add(review);
            review.setSubject(this);
            updateStars(review.getStars());
        }
    }

    @Override
    public void updateStars(int newStars) {
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getStars();
        }
        stars = reviews.isEmpty() ? 0 : totalStars / reviews.size();
    }

    public int getStars() {
        return stars;
    }

    public List<Review> getReviews() {
        return Collections.unmodifiableList(reviews);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", movies=" + movies +
                '}';
    }
}
