import java.util.*;

class FunctionOverloading {
    // function overloading
    static void multiply(Float a) {
        System.out.println(a * a);
    }

    static void multiply(double a, double b) {
        System.out.print(a * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your shape\n1.Square\n2.Rectangle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter side of square: ");
                Float side = sc.nextFloat();
                multiply(side);
                break;
            case 2:
                System.out.println("Enter length of rectangle: ");
                int length = sc.nextInt();
                System.out.println("Enter breadth of rectangle: ");
                int breadth = sc.nextInt();
                multiply(length, breadth);
                break;
            default:
                System.out.println("Invalid option");
        }
        sc.close();
    }
}
