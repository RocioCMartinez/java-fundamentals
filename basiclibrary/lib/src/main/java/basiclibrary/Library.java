/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.HashSet;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Library {
    public static int[] roll(int n) {
        int[] rolls = new int[n];
        Random random = new Random();


        for (int i = 0; i < n; i++) {
            rolls[i] = random.nextInt(6) + 1;
        }
        return rolls;
    }

//
    public static boolean containsDuplicates(int[] rolls) {
        for (int i = 0; i < rolls.length - 1; i++) {
            for (int j = i + 1; j < rolls.length; j++) {
                if (rolls[i] == rolls[j]) {
                    return true; // Duplicate value found
                }
            }
        }

        return false; // No duplicate values found
    }

    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0; // Return 0 for an empty array to avoid division by zero
        }

        int sum = 0;
        for (int num : arr) {
            sum += num; // Calculate the sum of all the values in the array
        }

        double average = (double) sum / arr.length; // Calculate the average

        return average;
    }

    // From Code Review / Aaron Clark
    public int[] lowestAverage(int[][] arr){
        int minIndex = 0;
        double minAvg = Double.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            double average = calculateAverage(arr[i]);
            if (average < minAvg){
                minIndex = i;
                minAvg = average;
            }
        }
        return arr[minIndex];
    }

    public static String analyzeWeatherData(int[][] weeklyMonthTemperatures){
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        HashSet<Integer> includedTemps = new HashSet<>();

        for (int[] weekTemperatures : weeklyMonthTemperatures){
            for (int temperature : weekTemperatures){
                includedTemps.add(temperature);
                minTemp = Math.min(minTemp, temperature);
                maxTemp = Math.max(maxTemp, temperature);
            }
        }

        String missingTemps = "";

        for (int temperature = minTemp; temperature <= maxTemp; temperature++) {
            boolean foundTemp = false;
            outerLoop:
            for (int[] weekTemperatures : weeklyMonthTemperatures) {
                for (int temp : weekTemperatures) {
                    if (temp == temperature) {
                        foundTemp = true;
                        break outerLoop;
                    }
                }
            }
            if (!foundTemp) {
                missingTemps += "Never saw temperature: " + temperature + "\n";
            }
        }
        String result = "High: " + maxTemp + "\n";
        result += "Low: " + minTemp + "\n";
        result += missingTemps;

        return result;
    }

    public static String tally(List<String> votes) {
        Map<String, Integer> voteCount = new HashMap<>();

        // Count the votes
        for (String vote : votes) {
            voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
        }

        // Find the option with the maximum votes
        String winner = "";
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        return winner + " received the most votes!";
    }
}
