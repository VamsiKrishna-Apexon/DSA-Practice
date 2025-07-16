public class FibonocciDP {

    public static int fibonocci(int n) {
        if (n<=1)
            return n;
        // 0 1 1 2 3 5 8 13 21
       // 0 1, 1 1, 1 2, 2 3
        int[] dp = new int[]{0,1};
        for(int i=2;i<=n;i++){
            int temp = dp[1];
            dp[1] = dp[0] + dp[1];
            dp[0] = temp;
            //System.out.println(dp[0] + " " + dp[1]);
        }
        return dp[1];
    }

    // Test the function
    public static void main(String[] args) {
        System.out.println(fibonocci(8));  // Output: 21
    }
}
