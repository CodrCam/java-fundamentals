package basiclibrary;

import java.util.Random;

public class DiceRoller {
    public static int[] roll(int n) {
        int[] rolls = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            rolls[i] = random.nextInt(6) + 1;
        }

        return rolls;
    }
}
