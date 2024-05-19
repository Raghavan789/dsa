import java.util.Scanner;

public class dayonerep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dna = scanner.nextLine();

        int currentCharCount = 1;
        int longestCharCount = 1;
        char currentChar = dna.charAt(0);

        for (int i = 1; i < dna.length(); i++) {
            char nextChar = dna.charAt(i);
            if (nextChar == currentChar) {
                currentCharCount++;
            } else {
                longestCharCount = Math.max(longestCharCount, currentCharCount);
                currentCharCount = 1;
                currentChar = nextChar;
            }
        }

       
        longestCharCount = Math.max(longestCharCount, currentCharCount);

        System.out.println(longestCharCount);
    }
}
