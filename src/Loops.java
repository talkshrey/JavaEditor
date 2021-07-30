public class Loops {
    public static void main(String[] args) {
        // creating arrays
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++)//for loop
        {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int list[] = {1,2,3,4,5,6,7,8,9};
        int x = 0; int y = 0;
        while(x<9)//while loop
        {
            System.out.println(list[x]);
            x++;
        }
        do{
            System.out.print(list[y]);
            y++;
        }while(y<9);
    }
}
