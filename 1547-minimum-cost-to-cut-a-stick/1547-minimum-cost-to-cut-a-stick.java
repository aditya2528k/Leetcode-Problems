class Solution {
    public int minCost(int n, int[] cuts) {
        int[] cuts1 = new int[cuts.length + 2];
        cuts1[0] = 0;
        for(int i = 0; i < cuts.length; i++){
            cuts1[i + 1] = cuts[i];
        }
        cuts1[cuts1.length - 1] = n;
        int s = cuts1.length;
        int[][] dp = new int[s][s];
        for(int i = 0; i < s; i++){
            Arrays.fill(dp[i], -1);
        }
        Arrays.sort(cuts1);
        return fun(cuts1, 1, s - 2, dp); 
    }
    public int fun(int[] nums, int i, int j, int[][] dp){
        if(i > j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int res = Integer.MAX_VALUE;
        for(int k = i; k <= j; k++){
            int cost = nums[j + 1] - nums[i - 1];

            int left = fun(nums, i, k - 1, dp);
            int right = fun(nums, k + 1, j, dp);
            int total = left + right + cost;
            res = Math.min(res, total);
        }
        dp[i][j] = res;
        return res;
    }
}