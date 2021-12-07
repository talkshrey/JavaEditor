import java.util.*;

public class Matrix_sum {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        System.out.println("Enter array elements: ");
        int [][] arr = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array is: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int x=0; x<c; x++) {
            int sum = 0;
            for(int y=0; y<r; y++) {
                sum = sum + arr[y][x];
            }
            System.out.println("Sum of column "+ (x+1) + "=" + sum);
        }

    }
}
