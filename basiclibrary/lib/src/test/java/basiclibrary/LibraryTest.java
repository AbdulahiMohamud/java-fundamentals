/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test void dicerollMethodTest() {
        Library sut = new Library();
        System.out.println("Die rolls: " + Arrays.toString(sut.roll(6)));
    }
    @Test void checkduplicatedMethodTest() {
        Library sut = new Library();
        int[] arr = {1,2,3,1};
        assertTrue(sut.containsDuplicates(arr),"checks if there duplacates");
    }

    @Test void someAvgMethod() {

    }
    @Test void someLowArrAvgMethod() {

    }
    @Test
    void someWeatherTempMethod() {
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assert(sut.temp(weeklyMonthTemperatures).equals("51 52 53 54 55 56 57 58 59 60 61 62 64 65 66 70 71 72 "));
    }

    @Test void someTallyMethod() {
        Library sut = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String winner = sut.tally(votes);
        assert(winner.equals("Bush"));
        System.out.println(winner + " received the most votes!");
    }


}
