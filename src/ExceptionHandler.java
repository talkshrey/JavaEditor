public class ExceptionHandler {
    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[0]));
        } 
        
        catch (NumberFormatException e) {
            System.out.println("Your input is not a number");
        }
    }
}
