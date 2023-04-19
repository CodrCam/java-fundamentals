package basiclibrary;

import basiclibrary.ArrayHelper;
import basiclibrary.DiceRoller;

public class Main {
    public static void main(String[] args) {
        // Test the roll method
        int[] rolls = DiceRoller.roll(4);
        for (int roll : rolls) {
            System.out.print(roll + " ");
        }
        System.out.println();

        // Test the containsDuplicates method
        int[] arrayWithDuplicates = {1, 2, 3, 2};
        System.out.println(ArrayHelper.containsDuplicates(arrayWithDuplicates)); // Should print true

        // Test the calculateAverage method
        int[] arr = {1, 2, 3, 4};
        System.out.println(ArrayHelper.calculateAverage(arr)); // Should print 2.5

        // Test the findArrayWithLowestAverage method
        int[][] arrays = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] lowestAverageArray = ArrayHelper.findSubArrayWithLowestAverage(arrays);
        for (int num : lowestAverageArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
