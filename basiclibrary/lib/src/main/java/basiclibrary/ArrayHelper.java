package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayHelper {

    public static int[] roll(int n) {
        int[] rolls = new int[n];
        for (int i = 0; i < n; i++) {
            rolls[i] = (int) (Math.random() * 6) + 1;
        }
        return rolls;
    }

    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : arr) {
            if (numbers.contains(num)) {
                return true;
            } else {
                numbers.add(num);
            }
        }
        return false;
    }

    public static double calculateAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static int[] findSubArrayWithLowestAverage(int[][] arrays) {
        int[] lowestAverageArray = null;
        double lowestAverage = Double.MAX_VALUE;

        for (int[] array : arrays) {
            double currentAverage = calculateAverage(array);
            if (currentAverage < lowestAverage) {
                lowestAverage = currentAverage;
                lowestAverageArray = array;
            }
        }

        return lowestAverageArray;
    }

    public static String tally(List<String> votes) {
        Map<String, Integer> voteCounts = new HashMap<>();
        String winner = null;
        int maxVotes = 0;

        for (String vote : votes) {
            int currentVotes = voteCounts.getOrDefault(vote, 0) + 1;
            voteCounts.put(vote, currentVotes);

            if (currentVotes > maxVotes) {
                winner = vote;
                maxVotes = currentVotes;
            }
        }

        return winner;
    }

    public static String analyzeWeatherData(int[][] weeklyMonthTemperatures) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        Set<Integer> uniqueTemps = new HashSet<>();

        for (int[] week : weeklyMonthTemperatures) {
            for (int temp : week) {
                minTemp = Math.min(minTemp, temp);
                maxTemp = Math.max(maxTemp, temp);
                uniqueTemps.add(temp);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("High: ").append(maxTemp).append("\n");
        result.append("Low: ").append(minTemp).append("\n");

        for (int i = minTemp; i <= maxTemp; i++) {
            if (!uniqueTemps.contains(i)) {
                result.append("Never saw temperature: ").append(i).append("\n");
            }
        }

        return result.toString();
    }
}
