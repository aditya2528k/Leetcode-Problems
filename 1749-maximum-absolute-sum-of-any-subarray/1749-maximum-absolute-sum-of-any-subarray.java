class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = nums[0];
        int ans = Math.abs(nums[0]);
        int min = nums[0];

        for(int i = 1; i < nums.length; i++){
            int v1 = nums[i];
            int v2 = max + nums[i];
            int v3 = nums[i] + min;
           max = Math.max(v1, v2);
           min = Math.min(v1, v3);
           ans = Math.max(ans, Math.max(Math.abs(max), Math.abs(min)));
        }
        return ans;
    }
}