import java.util.*;
public class daytwoincreasing {

    public static int minMovesIncreasing(int[] arr) {
        int n = arr.length;
        int moves = 0;
        int prev = Integer.MIN_VALUE;  
        for (int num : arr) {
            // Similar logic as the previous versions
            moves += Math.max(0, num - prev);
            prev = num;
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr= new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
        int minMoves = minMovesIncreasing(arr);
        System.out.println("Minimum moves required: " + minMoves);
    }
}
