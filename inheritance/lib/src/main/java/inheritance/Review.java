package main.java.inheritance;

public class Review {
    private String body;
    private User author;
    private int stars;
    private Object subject;
    private String movie;
    private Restaurant restaurant;

    public Review(String body, User author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = Math.min(Math.max(stars, 0), 5);
        this.subject = null;
        this.movie = null;
    }

    public Review(String body, User author, int stars, String movie) {
        this(body, author, stars);
        this.movie = movie;
    }

    public void setSubject(Object subject) {
        this.subject = subject;
    }

    public Object getSubject() {
        return subject;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void updateStars(int newStars) {
        int oldStars = stars;
        stars = Math.min(Math.max(newStars, 0), 5);
        if (restaurant != null) {
            restaurant.addReview(new Review(body, author, newStars));
        }
    }


    // Other getter and setter methods

    @Override
    public String toString() {
        String movieInfo = movie == null ? "" : ", movie='" + movie + '\'';
        return "Review{" +
                "body='" + body + '\'' +
                ", author=" + author.getName() +
                ", stars=" + stars +
                movieInfo +
                '}';
    }
}
