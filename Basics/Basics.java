package Basics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Basics {
    public static void main(String[] args) {
        // Test the pluralize function
        System.out.println(pluralize("dog", 0)); // should print "dogs"
        System.out.println(pluralize("cat", 1)); // should print "cat"
        System.out.println(pluralize("bird", 2)); // should print "birds"

        // Test the flipNHeads function
        flipNHeads(5);

        // Run the clock function
        clock();
    }

    public static String pluralize(String word, int num) {
        if (num == 0 || num > 1) {
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads(int n) {
        Random random = new Random();
        int numHeads = 0;
        int numFlips = 0;

        while (numHeads < n) {
            numFlips++;
            double rand = random.nextDouble();
            if (rand < 0.5) {
                System.out.println("tails");
                numHeads = 0;
            } else {
                System.out.println("heads");
                numHeads++;
            }
        }

        System.out.printf("It took %d flips to flip %d heads in a row.%n", numFlips, n);
    }

    public static void clock() {
        double prevTime = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            double currTime = Double.parseDouble(now.format(DateTimeFormatter.ofPattern("ss.SSS")));
            if (currTime > prevTime) {
                System.out.printf("\r%s ", now.format(formatter));
                double speed = 1.0 / (currTime - prevTime);
                if (speed > 1000000000) {
                    System.out.printf("(%.2f GHz)", speed / 1000000000);
                } else if (speed > 1000000) {
                    System.out.printf("(%.2f MHz)", speed / 1000000);
                } else if (speed > 1000) {
                    System.out.printf("(%.2f kHz)", speed / 1000);
                } else {
                    System.out.printf("(%.2f Hz)", speed);
                }
                prevTime = currTime;
            }
        }
    }
}
