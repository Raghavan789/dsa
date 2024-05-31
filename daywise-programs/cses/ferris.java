import java.util.*;

public class ferris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of children
        int x = scanner.nextInt(); // maximum allowed weight

        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        // Sort the weights in non-decreasing order
        Arrays.sort(weights);

        int i = 0;  // pointer to the lightest child
        int j = n - 1;  // pointer to the heaviest child
        int gondolas = 0;

        while (i <= j) {
            // If the lightest and heaviest child can share a gondola
            if (weights[i] + weights[j] <= x) {
                i++; // move to the next lightest child
            }
            // In either case, the heaviest child gets a gondola
            j--; // move to the next heaviest child
            gondolas++; // count this gondola
        }

        System.out.println(gondolas);
    }
}
