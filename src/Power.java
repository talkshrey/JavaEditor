import java.util.*;

public class Power {

    static int recursion(int a, int b) {
        int ans;
        if (b == 0) {
            ans = 1;
        } else {
            ans = a * recursion(a, b - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x in x^y: ");
        int x = sc.nextInt();
        System.out.println("Enter y in x^y: ");
        int y = sc.nextInt();
        System.out.println(recursion(x, y));
        sc.close();
    }
}
