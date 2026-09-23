class Solution {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        return fun(nums, n, 0, 1, dp);
    }
    int fun(int[] nums, int n, int i, int free, int[][] dp){
        if(i == n){
            return 0;
        }
        if(dp[i][free] != -1){
            return dp[i][free];
        }
        int c1 = 0;
        int c2 = 0;
        if(free == 0){
            return dp[i][free] = fun(nums, n, i + 1, 1, dp);
        }
        c1 = nums[i] + fun(nums, n, i + 1, 0, dp);
        c2 = fun(nums, n, i + 1, 1, dp);
        return dp[i][free] = Math.max(c1, c2);
    }
}