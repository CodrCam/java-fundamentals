package main.java.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Restaurant implements Reviewable {
    private String name;
    private int stars;
    private String price;
    private List<Review> reviews;

    public Restaurant(String name, int stars, String priceCategory) {
        this.name = name;
        this.stars = Math.min(Math.max(stars, 0), 5);
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addReview(Review review) {
        if (review.getSubject() != this && !reviews.contains(review) && review.getAuthor().addReview(review)) {
            reviews.add(review);
            review.setSubject(this);
            updateStars(review.getStars());
        }
    }

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
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                '}';
    }
}
