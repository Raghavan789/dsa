import java.util.Scanner;

public class daythreespiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        StringBuilder results = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long y = scanner.nextLong();
            long x = scanner.nextLong();
            results.append(findNumberInSpiral(y, x)).append("\n");
        }
        
        System.out.print(results.toString());
        scanner.close();
    }

    private static long findNumberInSpiral(long y, long x) {
        long n = Math.max(y, x);
        long value;
        
        if (n % 2 == 0) {
            if (y == n) {
                value = n * n - x + 1;
            } else {
                value = (n - 1) * (n - 1) + y;
            }
        } else {
            if (x == n) {
                value = n * n - y + 1;
            } else {
                value = (n - 1) * (n - 1) + x;
            }
        }
        
        return value;
    }
}
