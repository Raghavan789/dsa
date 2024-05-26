import java.util.Scanner;

public class Knights {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        for (int k = 1; k <= n; k++) {
            long totalPairs = (long) k * k * (k * k - 1) / 2;
            long attackPairs = 4 * (k - 1) * (k - 2);
            long nonAttackPairs = totalPairs - attackPairs;
            System.out.println(nonAttackPairs);
        }
    }
}
