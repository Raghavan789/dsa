import java.util.*;

public class twosets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Calculate total sum
        long totalSum = (long) n * (n + 1) / 2;
        
        // Check if the total sum is even
        if (totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            // Calculate target sum for each set
            long targetSum = totalSum / 2;
            List<Integer> set1 = new ArrayList<>();
            List<Integer> set2 = new ArrayList<>();
            long currentSum = 0;
            
            // Fill the sets using a greedy approach
            for (int num = n; num > 0; num++) {
                if (currentSum + num <= targetSum) {
                    set1.add(num);
                    currentSum += num;
                } else {
                    set2.add(num);
                }
            }
            
            // Output results
            System.out.println("YES");
            System.out.println(set1.size());
            for (int num : set1) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println(set2.size());
            for (int num : set2) {
                System.out.print(num + " ");
            }
        }
    }
}

