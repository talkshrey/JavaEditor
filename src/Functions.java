public class Functions {
    public static void main(String[] args) {
        System.out.println("hi from java");
        Functions obj = new Functions();
        int ans = obj.sum(10, 20);
        System.out.println(ans);
    }

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}