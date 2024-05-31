import java.util.*;

class apartements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of applicants
        int m = scanner.nextInt(); // number of apartments
        int k = scanner.nextInt(); // maximum allowed difference
        
        // Array to store desired apartment sizes of applicants
        int[] applicants = new int[n];
        for (int i = 0; i < n; i++) {
            applicants[i] = scanner.nextInt();
        }
        
        // Array to store sizes of apartments
        int[] apartments = new int[m];
        for (int i = 0; i < m; i++) {
            apartments[i] = scanner.nextInt();
        }
        
        // Sort the arrays
        Arrays.sort(applicants);
        Arrays.sort(apartments);
        
        // Pointers for applicants and apartments
        int i = 0, j = 0;
        int count = 0;
        
        while (i < n && j < m) {
            // Check if the apartment size is within the acceptable range for the applicant
            if (Math.abs(applicants[i] - apartments[j]) <= k) {
                count++;
                i++;
                j++;
            }
            // If the apartment size is too small, move to the next apartment
            else if (applicants[i] - apartments[j] > k) {
                j++;
            }
            // If the apartment size is too large, move to the next applicant
            else {
                i++;
            }
        }
        
        System.out.println(count);
    }
}
