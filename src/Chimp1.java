import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Chimp1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, Integer> nums = new Hashtable<Integer, Integer>();
        System.out.println("Number of elements:"); // 4
        int size = sc.nextInt();
        System.out.println("Enter array:"); // 2 3 4 7


        for(int i=0;i<size;i++) {
            int x = sc.nextInt();
            nums.put(i, x);
        }       
        
        System.out.println("Enter target:");
        int target = sc.nextInt(); // 5
        int [] ans = new int[2];
        for(int i=0;i<size;i++) {
            int diff = target - nums(i); // 5 - 2 = 3
            if(nums.containsKey(diff)) {
                ans[0] = i;
                ans[1] = diff;
                break;
            }
        }

        System.out.println(ans[0] + " " + ans[1]);
        sc.close();
    }
}
