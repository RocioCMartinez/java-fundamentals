/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

class LibraryTest {
    @Test public void rollTest() {
        // Arrange
        Library sut = new Library();
        // Act
        int numRolls = 10;
        int[] rolls = sut.roll(numRolls);

        // Assert that the length of the rolls array matches the number of rolls
        assertEquals(numRolls, rolls.length);

        // Assert that each roll value is within the valid range of 1 to 6
        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 6);
        }
    }

    @Test public void testContainsDuplicates() {
        Library sut = new Library();

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 3, 4};

        assertFalse(sut.containsDuplicates(array1)); // No duplicates, should return false
        assertTrue(sut.containsDuplicates(array2)); // Duplicates present, should return true
    }

    @Test public void testCalculateAverage() {
        Library sut = new Library();

        int[] numbers1 = {1, 2, 3, 4, 5};
        double average1 = sut.calculateAverage(numbers1);
        assertEquals(3.0, average1); // Expected average: 3.0

        int[] numbers2 = {0, -5, 10, 7, -3};
        double average2 = sut.calculateAverage(numbers2);
        assertEquals(1.8, average2); // Expected average: 1.8

        int[] numbers3 = {};
        double average3 = sut.calculateAverage(numbers3);
        assertEquals(0.0, average3); // Expected average: 0.0 (for an empty array)
    }

    // From Code Review / Aaron Clark
    @Test public void testLowestAverage() {
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] expected = {55, 54, 60, 53, 59, 57, 61};
        int[] actualOutput = sut.lowestAverage(weeklyMonthTemperatures);

        assertArrayEquals(expected, actualOutput, "Expected array {55, 54, 60, 53, 59, 57,61}");
    }

    @Test public void testAnalyzeWeatherData() {
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };



        String resultOutput = sut.analyzeWeatherData(weeklyMonthTemperatures);
        String expectedOutput = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n";

        assertEquals(expectedOutput, resultOutput);
    }

    @Test public void testTally() {
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


        String result = sut.tally(votes);

        assertEquals("Bush received the most votes!", result);

    }



}
