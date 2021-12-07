import java.util.*;

public class Matrix_addition {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        System.out.println("Enter array 1 elements: ");
        int [][] arr1 = new int[r][c];
        int [][] arr2 = new int[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter array 2 elements: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int [][] sum_arr = new int[r][c];
        System.out.println("Array addition is: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                sum_arr[i][j] = arr1[i][j]+ arr2[i][j];
            }
            System.out.println();
        }

        for(int x=0; x<r; x++) {
            for(int y=0; y<c; y++) {
                System.out.print(sum_arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}
