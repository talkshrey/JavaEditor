import java.util.Scanner;
public class PalindromeName {
    public static void main(String[] args){
        System.out.println("Enter any word:");
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();//Shrey
        String rev_name = "";
        for(int i=name.length()-1; i>=0; i--){
            char letter = name.charAt(i);
            rev_name = rev_name.concat(Character.toString(letter));
        }
        if (rev_name.equals(name)) {
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
        obj.close();
    }
}

