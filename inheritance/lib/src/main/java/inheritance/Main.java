package main.java.inheritance;

public class Main {
    public static void main(String[] args) {
        // Testing Restaurant constructor and toString
        Restaurant daveAndBusters = new Restaurant("Dave and Busters", 4, "$$$");
        System.out.println(daveAndBusters.toString());

        // Testing ChainRestaurant
        ChainRestaurant burgerKing = new ChainRestaurant("Burger King", "Midtown", 3, "$");
        System.out.println(burgerKing.toString());

        // Testing User class
        User coolDude = new User("CoolDude");
        User foodieQueen = new User("FoodieQueen");

        // Testing Review constructor and toString
        Review review = new Review("Awesome arcade and great food!", coolDude, 5);
        System.out.println(review.toString());

        // Testing addReview and updating stars
        daveAndBusters.addReview(review);
        System.out.println(daveAndBusters.toString());
        System.out.println(review.toString());

        // Adding another review and checking if stars update correctly
        Review review2 = new Review("Fun place but a bit noisy.", foodieQueen, 3);
        daveAndBusters.addReview(review2);
        System.out.println(daveAndBusters.toString());
        System.out.println(review2.toString());

        // Testing updating review stars
        review.updateStars(4);
        System.out.println(daveAndBusters.toString());
        System.out.println(review.toString());

        // Testing user cannot submit multiple reviews for the same restaurant
        Review review3 = new Review("Dave and Busters is still amazing!", coolDude, 5);
        daveAndBusters.addReview(review3);
        System.out.println(daveAndBusters.toString());
    }
}
