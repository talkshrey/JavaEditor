import java.util.Scanner;

public class Input_output
{
    public static void main (String[] args)
    {
        System.out.println("Enter your name: ");
        String name = new String();
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println(name);
        sc.close();
    }
}