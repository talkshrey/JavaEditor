public class Matrix {
    public static void main(String [] args){
        int a [][] = {{1,3,4},{2,4,3},{3,4,5}};
        int b [][] = {{1,3,4},{2,4,3},{1,2,4}};
        int add[][] = new int[3][3];
        System.out.println("Matrix addition of a and b is:");
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                add[i][j] = a[i][j] + b[i][j];
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}
