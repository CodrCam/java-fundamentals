package main.java.inheritance;

public class Review {
    private String body;
    private User author;
    private int stars;
    private Restaurant restaurant;

    public Review(String body, User author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = Math.min(Math.max(stars, 0), 5);
        this.restaurant = null;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getAuthor() {
        return author;
    }

    public void updateStars(int newStars) {
        int oldStars = stars;
        stars = Math.min(Math.max(newStars, 0), 5);
        if (restaurant != null) {
            restaurant.addReview(new Review(body, author, newStars));
        }
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author.getName() + '\'' +
                ", stars=" + stars +
                ", restaurant=" + (restaurant == null ? "null" : restaurant.getName()) +
                '}';
    }
}
