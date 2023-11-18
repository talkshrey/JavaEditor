import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        int l = s.length();
        int vow = 0, digit = 0, special = 0, bs = 0, con = 0, alpha = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i); // to check which kind of character is present at index i.
            if (Character.isDigit(c))
                digit++;
            else if (Character.isAlphabetic(c))
                alpha++;
            else if (c == ' ')
                bs++;
        }

        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U')
                vow++;
        }
        con = alpha - vow;
        special = l - digit - alpha - bs;

        System.out.println("Number of digits are:" + digit);
        System.out.println("Number of alphabets are:" + alpha);
        System.out.println("Number of blank spaces are:" + bs);
        System.out.println("Number of vowels are:" + vow);
        System.out.println("Number of consonants are:" + con);
        System.out.println("Number of special characters are:" + special);
        sc.close();
    }
}
