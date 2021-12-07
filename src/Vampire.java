import java.util.*;
public class Vampire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int n = sc.nextInt();
        if(n%2==0) {
            int arr[] = new int[4];
            int arr2[] = new int[16];
            for(int i=0;i<4;i++) {
                arr[i] = n%10;
                n = n/10;
            }
            for(int p=0;p<4;p++) {
                for(int q=0;q<4;q++) {
                    arr2[(p*4)+q] = arr[p]*10 + arr[q];
                }
            }
            for(int x=0;x<16;x++) {
                System.out.print(arr2[x]+" ");
            }
        }
    }
}