public class ClimbingStairs {
    public static int climbStairs(int n) {
        //1 2 3 5
        if(n<=2)
            return n;
        int[] dp = new int[]{1,2};
        for(int i=3;i<=n;i++){
            int temp = dp[0];
            dp[0] = dp[1];
            dp[1] = temp + dp[1];
        }
        return dp[1];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(7));  // Output: 8
    }
}
