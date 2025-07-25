public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<n;i++)
            dp[0][i] = 1;
        for(int i=0;i<m;i++)
            dp[i][0] = 1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
       /*
        1 1 1
        1 2 3
        1 3 6
        1 4 10
        1 5 15
        1 6 21
        1 7 28
        */
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));  // Output: 8
    }
}
