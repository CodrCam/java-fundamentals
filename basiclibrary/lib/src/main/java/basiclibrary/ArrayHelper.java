package basiclibrary;

import java.util.Set;
import java.util.HashSet;

public class ArrayHelper {

    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : arr) {
            if (uniqueNumbers.contains(number)) {
                return true;
            }
            uniqueNumbers.add(number);
        }

        return false;
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int number : arr) {
            sum += number;
        }

        return (double) sum / arr.length;
    }

    public static int[] findSubArrayWithLowestAverage(int[][] arr) {
        int indexWithLowestAverage = 0;
        double lowestAverage = calculateAverage(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            double currentAverage = calculateAverage(arr[i]);
            if (currentAverage < lowestAverage) {
                lowestAverage = currentAverage;
                indexWithLowestAverage = i;
            }
        }

        return arr[indexWithLowestAverage];
    }

    public static int[] findArrayWithLowestAverage(int[][] arr) {
        return new int[0];
    }
}