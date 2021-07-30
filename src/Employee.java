import java.util.Scanner;
public class Employee {
    public static void main(String [] args){
        String [] name = new String[3];
        int [] year = new int[3];
        String [] address = new String[3];
        for(int i=0; i<3; i++) {
            System.out.println("Enter details of employee " +(i+1));
            Scanner obj = new Scanner(System.in);
            System.out.print("Name: ");
            name[i] = obj.next();
            System.out.print("Year of joining: ");
            year[i] = obj.nextInt();
            System.out.print("Address: ");
            address[i] = obj.next();
            obj.close();
        }
        System.out.println("The details of employees are");
        System.out.println("Name\tYear of joining\t\tAddress");
        for(int i=0; i<3; i++) {
            System.out.println(name[i]+"\t"+year[i]+"\t\t"+address[i]);
        }
    }
}
