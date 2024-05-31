import java.util.*;

public class threesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of elements in the array
        int x = sc.nextInt(); // Target sum
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Reading the array elements
        }
        
        // Iterate over each element as the fixed element
        for (int i = 0; i < n - 2; i++) {
            int currentSum = x - a[i]; // Calculate the remaining sum needed
            Map<Integer, Integer> map = new HashMap<>();
            
            // Try to find two elements in the remaining array that sum to currentSum
            for (int j = i + 1; j < n; j++) {
                int complement = currentSum - a[j];
                
                if (map.containsKey(complement)) {
                    // If found, print the 1-based indices of the three elements
                    System.out.println((i + 1) + " " + (map.get(complement) + 1) + " " + (j + 1));
                    return;
                }
                
                // Add the current element to the map
                map.put(a[j], j);
            }
        }
        
        // If no triplet is found, print "IMPOSSIBLE"
        System.out.println("IMPOSSIBLE");
    }
}
