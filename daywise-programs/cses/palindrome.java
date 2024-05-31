import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String result = palindromeReorder(s);
        System.out.println(result);
        scanner.close();
    }

    public static String palindromeReorder(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        StringBuilder palindrome = new StringBuilder();
        StringBuilder middleChar = new StringBuilder();

        // Create the left part of the palindrome
        for (char c = 'A'; c <= 'Z'; c++) {
            int count = counter.getOrDefault(c, 0);
            while (count >= 2) {
                palindrome.append(c);
                count -= 2;
            }
            if (count == 1) {
                middleChar.append(c);
            }
        }

        // If there's more than one odd-count character, palindrome is not possible
        if (middleChar.length() > 1) {
            return "NO SOLUTION";
        }

        // Construct the final palindrome by combining left part, middle character(s), and reversed left part
        return palindrome.toString() + middleChar.toString() + palindrome.reverse().toString();
    }
}
