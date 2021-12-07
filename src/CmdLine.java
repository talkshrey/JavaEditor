public class CmdLine {
    public static void main(String [] args) {
        int n = Integer.parseInt (args[0]);
        int c = 0;
        while (n > 0) {
        n /= 10;
        c++;
        }
        System.out.println ("number of digits: " + c);
    }
}