/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class inheritanceTest {
    Restaurant newRestaurant = new Restaurant("Jubba", "$");
    Review newReview = new Review("Abdulahi", "Was dirty and nasty", 1);
    Review newReview2 = new Review("Bill", "best food in the city", 5);

    @Test
    void restaurantConsNamePrice_test() {
        assertTrue(newRestaurant.getName() == "Jubba");
        assertTrue(newRestaurant.getPrice() == "$");
    }

    @Test
    void ResturantData_test() {
        assertEquals("Jubba $ 0" ,newRestaurant.toString());
    }

    @Test
    void reviewConstInput_test() {
        assertTrue(newReview.getAuthor() == "Abdulahi");
        assertTrue(newReview.getNotes() == "Was dirty and nasty");
        assertTrue(newReview.getNumStar() == 1);
    }

    @Test
    void ReviewString_test() {
        assertEquals("Abdulahi Was dirty and nasty 1", newReview.toString());
    }

    @Test
    void ResArrayUpdate_test() {
        newRestaurant.addReview(newReview);
        Review checkReview = newRestaurant.getReviewList().get(0);
        assertEquals("Abdulahi Was dirty and nasty 1", checkReview.toString());
    }

    @Test
    void numstars_test() {
        newRestaurant.addReview(newReview);
        newRestaurant.addReview(newReview2);
        assertEquals(3, newRestaurant.getNumStar());
    }
}