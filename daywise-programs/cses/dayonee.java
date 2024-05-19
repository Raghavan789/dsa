import java.util.Scanner;

public class dayonee {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long n = scanner.nextInt();

    long expectedSum = (n * (n + 1)) / 2;

    long actualSum = 0;
    for (int i = 0; i < n - 1; i++) {
      actualSum += scanner.nextInt();
    }

    long missingNumber = expectedSum - actualSum;

    System.out.println(missingNumber);
  }
}
