import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = 1L << n; // Using bit shift for power of 2
        System.out.println(k);
        scanner.close();
    }
}
