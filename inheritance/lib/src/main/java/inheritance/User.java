package main.java.inheritance;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private Set<Review> reviews;

    public User(String name) {
        this.name = name;
        this.reviews = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public boolean addReview(Review review) {
        if (reviews.add(review)) {
            review.setAuthor(this);
            return true;
        }
        return false;
    }
}
