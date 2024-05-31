import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TowerOfHanoi {

    // Function to perform the Tower of Hanoi algorithm
    private static void towerOfHanoi(int n, int source, int target, int auxiliary, List<int[]> moves) {
        if (n == 1) {
            moves.add(new int[]{source, target});
        } else {
            towerOfHanoi(n - 1, source, auxiliary, target, moves);
            moves.add(new int[]{source, target});
            towerOfHanoi(n - 1, auxiliary, target, source, moves);
        }
    }

    // Function to solve the Tower of Hanoi problem
    public static List<int[]> solveTowerOfHanoi(int n) {
        List<int[]> moves = new ArrayList<>();
        towerOfHanoi(n, 1, 3, 2, moves);
        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<int[]> moves = solveTowerOfHanoi(n);

        // Print the result
        System.out.println(moves.size());
        for (int[] move : moves) {
            System.out.println(move[0] + " " + move[1]);
        }
    }
}