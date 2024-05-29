import java.util.Scanner;

public class daytwoincreasing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        long[] array = new long[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }
        
        long moves = 0;
        
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                moves += array[i - 1] - array[i];
                array[i] = array[i - 1];
            }
        }
        
        System.out.println(moves);
    }
}