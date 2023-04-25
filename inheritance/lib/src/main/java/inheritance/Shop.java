package main.java.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Shop implements Reviewable {
    private String name;
    private String description;
    private String price;
    private List<Review> reviews;
    private int stars;

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new ArrayList<>();
        this.stars = 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public List<Review> getReviews() {
        return Collections.unmodifiableList(reviews);
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

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", stars=" + stars +
                '}';
    }
}
