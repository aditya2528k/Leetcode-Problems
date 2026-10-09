class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int k = 4;
        int[][] dp = new int[n + 1][k + 1];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return fun(prices, n, 0, 4, dp);
    }
    public int fun(int[] nums, int n, int i, int k, int[][] dp){
        if(i == n || k == 0){
            return 0;
        }
        if(dp[i][k] != -1){
            return dp[i][k];
        }
        if(k % 2 == 0){
            int b1 = -nums[i] + fun(nums, n, i + 1, k - 1, dp);
            int c1 = fun(nums, n, i + 1, k, dp);
            dp[i][k] = Math.max(b1, c1);
        }else{
            int s1 = nums[i] + fun(nums, n, i + 1, k - 1, dp);
            int s2 = fun(nums, n, i + 1, k, dp);
            dp[i][k] = Math.max(s1, s2);
        }
        return dp[i][k];
    }
}