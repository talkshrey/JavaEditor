import java.util.Scanner ;
public class MinutesToYears {
    public static void main(String[] args){
        System.out.print("Input number of minutes: ");
        Scanner obj = new Scanner(System.in);
        int min;
        min = Integer.parseInt(obj.nextLine());
        int hours = min/60;
        int days = hours/24;
        int years = days/365;
        int remainder_days = days%365;
        System.out.println("Expected output: "+min+" minutes is approximately "+years+" years and "+remainder_days+" days");
        obj.close();
    }
}
