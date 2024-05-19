import java.util.*;

public class daytwopermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
            return;
        }
        
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        
        for (int i = 2; i <= n; i += 2) {
            evenNumbers.add(i);
        }
        
        for (int i = 1; i <= n; i += 2) {
            oddNumbers.add(i);
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int num : evenNumbers) {
            result.append(num).append(" ");
        }
        
        for (int num : oddNumbers) {
            result.append(num).append(" ");
        }
        
        // Print the result
        System.out.println(result.toString().trim());
    }
}
