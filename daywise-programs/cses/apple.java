import java.util.Scanner;

public class apple {

    public static int minDifference(int[] weights) {
        int totalSum = 0;
        for (int weight : weights) {
            totalSum += weight;
        }

        int halfSum = totalSum / 2;
        boolean[] dp = new boolean[halfSum + 1];
        dp[0] = true;

        for (int weight : weights) {
            for (int j = halfSum; j >= weight; j--) {
                dp[j] |= dp[j - weight];
            }
        }

        int minDiff = totalSum;
        for (int j = halfSum; j >= 0; j--) {
            if (dp[j]) {
                minDiff = Math.min(minDiff, totalSum - 2 * j);
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        int minDiff = minDifference(weights);
        System.out.println(minDiff);
    }
}
