import java.util.*;
import java.util.Scanner;
import java.math.BigInteger;

public class coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//test cases
        while(n>0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if( ((a+b)%3!=0) || (a>(2*b)) || (b>(2*a)) ){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            n--;
        }
          
      
    }
}
