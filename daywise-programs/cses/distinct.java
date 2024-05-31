import java.util.HashSet;
import java.util.Scanner;

public class distinct {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of values
        int n = scanner.nextInt();
        
        // Store distinct values in a HashSet
        HashSet<Integer> distinctValues = new HashSet<>();
        
        // Loop through the input integers and add them to the HashSet
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            distinctValues.add(value);
        }
        
        // Close the scanner
        scanner.close();
        
        // Print the number of distinct values
        System.out.println(distinctValues.size());
    }
}
