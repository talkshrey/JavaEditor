import java.util.*;

public class Worthy {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int arr[][] = new int[n][m];
        int count=0;
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] >= k) {
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}