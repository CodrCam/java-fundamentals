package main.java.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestUtils {

    @Test
    public void testRestaurantFunctionality() {
        Restaurant restaurant = new Restaurant("Pizza Place", 4, "$$");
        User user = new User("Bam Cam");

        Review review = new Review("Super greasy like pizza should be!", user, 5);
        restaurant.addReview(review);

        assertEquals(1, restaurant.getReviews().size());
        assertEquals(5, restaurant.getStars());
    }

    @Test
    public void testShopFunctionality() {
        Shop shop = new Shop("Bookstore", "Better than Amazon", "$$");
        User user = new User("Shelly Sue");

        Review review = new Review("Amazing selection of books!", user, 5);
        shop.addReview(review);

        assertEquals(1, shop.getReviews().size());
        assertEquals(5, shop.getStars());
    }

    @Test
    public void testTheaterFunctionality() {
        Theater theater = new Theater("MegaPlex");
        theater.addMovie("The Dark Knight");
        theater.addMovie("Interstellar");

        assertEquals(2, theater.getMovies().size());

        User user = new User("Jack Andrew");
        Review review = new Review("Perfect Show!", user, 5, "Inception");
        theater.addReview(review);

        assertEquals(1, theater.getReviews().size());
        assertEquals(5, theater.getStars());
    }

    @Test
    public void testChainRestaurantFunctionality() {
        ChainRestaurant chainRestaurant = new ChainRestaurant("McDonald's", "New York", 1, "$");
        User user = new User("Big American");

        Review review = new Review("Ok burger, fries were cold.", user, 3);
        chainRestaurant.addReview(review);

        assertEquals(1, chainRestaurant.getReviews().size());
        assertEquals(3, chainRestaurant.getStars());
    }

    @Test
    public void testReviewableInterfaceInteraction() {
        Shop shop = new Shop("Gadget World", "Find the latest gadgets", "$$$");
        User bob = new User("Bob Belcher");

        Review review = new Review("Great gadgets, but a bit pricey.", bob, 4);
        review.setSubject(shop);

        assertTrue(shop instanceof Reviewable);
        assertEquals(shop, review.getSubject());
    }

    @Test
    public void testStarsUpdateWithMultipleReviews() {
        Restaurant bobsBurgers = new Restaurant("Bob's Burgers", 4, "$$");

        User marshmallow = new User("Marshmallow");
        User teddy = new User("Teddy");
        User mort = new User("Mort");

        Review review1 = new Review("Delicious burgers, great service!", marshmallow, 5);
        bobsBurgers.addReview(review1);
        assertEquals(1, bobsBurgers.getReviews().size());
        assertEquals(5, bobsBurgers.getStars());

        Review review2 = new Review("The best burgers in town!", teddy, 5);
        bobsBurgers.addReview(review2);
        assertEquals(2, bobsBurgers.getReviews().size());
        assertEquals(5, bobsBurgers.getStars());

        Review review3 = new Review("Good food, but a bit slow service.", mort, 4);
        bobsBurgers.addReview(review3);
        assertEquals(3, bobsBurgers.getReviews().size());
        assertEquals(4, bobsBurgers.getStars());
    }

}
