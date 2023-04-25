package main.java.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
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
        if (review.getRestaurant() != this && !reviews.contains(review) && review.getAuthor().addReview(review)) {
            reviews.add(review);
            review.setRestaurant(this);
            updateStars();
        }
    }

    private void updateStars() {
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getStars();
        }
        stars = reviews.isEmpty() ? 0 : totalStars / reviews.size();
    }

    public int getStars() {
        return stars;
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
