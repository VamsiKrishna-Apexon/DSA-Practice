public class MinimumFallingSumPath {
    public static int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int min = Integer.MAX_VALUE;
        // if(m==1){
        //     for(int j=0;j<n;j++){
        //         min = Math.min(min,matrix[0][j]);
        //     }
        //     return min;
        // }
        int[][] dp = new int[m][n];

        //base case
        // for(int j=0;j<n;j++)
        //     dp[0][j] = matrix[0][j];
        System.arraycopy(matrix[0], 0, dp[0],0, n);

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0)
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j+1]);
                else if(j==n-1)
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j-1], dp[i-1][j]);
                else
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i-1][j+1]));
                // if(i==m-1)
                //     min = Math.min(min,dp[i][j]);
            }
        }
        for(int j=0;j<n;j++){
            min = Math.min(min,dp[m-1][j]);
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(minFallingPathSum(new int[][]{{2,1,3},{6,5,4},{7,8,9}}));  // Output: 8
    }
}
