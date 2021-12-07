import java.util.*;
public class Matrix_multiplication {
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

        int [][] matrix_multi = new int[r][c];

        for(int i=0;i<r;i++){    
            for(int j=0;j<c;j++) {    
            matrix_multi[i][j]=0;      
            for(int k=0;k<r;k++) {      
            matrix_multi[i][j]+= arr1[i][k] * arr2[k][j];      
            }
            System.out.print(matrix_multi[i][j]+" ");  
            } 
            System.out.println(); 
        }    
    }    
}