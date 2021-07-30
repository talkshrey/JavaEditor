public class Basics
{
    int b = 5;//instance variable
    static int c = 15;//static variable
    public static void main(String[] args) {
        System.out.println("I am Shrey sir");
        /*this is a multi-
        line comment*/
        int a = 10;// local variable
        Basics object = new Basics();//creating an object from class Basics
        System.out.println("Local variable is: " + a);
        System.out.println("Instance variable is: " + object.b);//object is an instance of class
        System.out.println("Static variable is: " + c);//can be accessed directly as it is a static variable
    }
}