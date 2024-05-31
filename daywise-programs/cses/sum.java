import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of elements in the array
        int x = sc.nextInt(); // Target sum
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Reading the array elements
        }
        
        // HashMap to store elements and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int complement = x - a[i]; // Complement of the current element
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If found, print the 1-based indices of the two elements
                System.out.println((map.get(complement) + 1) + " " + (i + 1));
                return;
            }
            
            // Add the current element to the map
            map.put(a[i], i);
        }
        
        // If no pair is found, print "IMPOSSIBLE"
        System.out.println("IMPOSSIBLE");
    }
}
