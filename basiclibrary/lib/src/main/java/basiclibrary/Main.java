package basiclibrary;

import java.basiclibrary.FileUtil;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        // Test the roll method
        int[] rolls = basiclibrary.DiceRoller.roll(4);
        for (int roll : rolls) {
            System.out.print(roll + " ");
        }
        System.out.println();

        // Test the containsDuplicates method
        int[] arrayWithDuplicates = {1, 2, 3, 2};
        com.example.ArrayHelper ArrayHelper = null;
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

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(ArrayHelper.analyzeWeatherData(weeklyMonthTemperatures));

        // Test the lintJavaScript method
        String gatesJsPath = "/resources.linter";
        String lintErrors = FileUtil.lintJavaScript(Paths.get(gatesJsPath));
        System.out.println(lintErrors);
    }
}
