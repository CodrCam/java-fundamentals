package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMethods {
    @Test
    public void testRoll() {
        int[] rolls = DiceRoller.roll(4);
        assertEquals(4, rolls.length);
        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 6);
        }
    }

    @Test
    public void testContainsDuplicates() {
        int[] arrayWithDuplicates = {1, 2, 3, 2};
        assertTrue(ArrayHelper.containsDuplicates(arrayWithDuplicates));

        int[] arrayWithoutDuplicates = {1, 2, 3, 4};
        assertFalse(ArrayHelper.containsDuplicates(arrayWithoutDuplicates));
    }

    @Test
    public void testCalculateAverage() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(2.5, ArrayHelper.calculateAverage(arr), 0.001);
    }

    @Test
    public void testFindSubArrayWithLowestAverage() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertArrayEquals(new int[]{1, 2, 3}, ArrayHelper.findArrayWithLowestAverage(arr));
        @Test
        void testAnalyzeWeatherData() {
            int[][] temperatures = {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}
            };
            String expectedOutput =
                    "High: 72\n" +
                            "Low: 51\n" +
                            "Never saw temperature: 63\n" +
                            "Never saw temperature: 67\n" +
                            "Never saw temperature: 68\n" +
                            "Never saw temperature: 69\n";
            assertEquals(expectedOutput, ArrayHelper.analyzeWeatherData(temperatures));
        }
    }
}
