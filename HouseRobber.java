public class HouseRobber {
    public static int maxProfit(int[] arr){
        if (arr.length == 1)
            return arr[0];
        int[] dp = new int[2];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for(int i=2;i<arr.length;i++){
            int temp = dp[0];
            dp[0] = dp[1];
            dp[1] = Math.max(temp+arr[i], dp[1]);
        }

        return dp[1];
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{9,2,7,9,12,1}));  // Output: 8
    }
}
