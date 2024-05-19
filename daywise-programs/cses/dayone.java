import java.util.Scanner;

public class dayone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();


        System.out.print(n + " ");

       
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 ;
		n+=1;
            }
            System.out.print(n + " ");
        }

        System.out.println(); 
    }
}
