import java.util.*;

public class PreemptivePriority {

    public static void swap(int a1[][], int a2[][], int num1, int num2) {
        int temp = a1[num1][num2];
        a1[num1][num2] = a1[num1 + 1][num2];
        a1[num1 + 1][num2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaration of process
        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Enter arrival time: ");
                        arr[i][j] = sc.nextInt();
                        break;
                    case 1:
                        System.out.print("Enter burst time: ");
                        arr[i][j] = sc.nextInt();
                        break;
                    case 2:
                        System.out.print("Enter priority of the process: ");
                        arr[i][j] = sc.nextInt();
                    case 3:
                        arr[i][j] = i + 1;
                    default:
                        break;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][0] > arr[i + 1][0]) {
                for (int j = 0; j < 4; j++) {
                    swap(arr, arr, i, j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }

        int count = 0;
        int priority = 100;
        for (int i = 0; i < arr.length - 1; i++) {
            if (count == arr[i][0]) {
                if (arr[i][2] < priority) {
                    System.out.print("P" + arr[i][3] + "\t");
                    priority = arr[i][2];
                } else {

                }
            }
            count++;
        }
        sc.close();
    }
}
