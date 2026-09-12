class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int max = nums[0];
        int maxsum = nums[0];
        int min = nums[0];
        int minsum = nums[0];
        for(int i = 1; i < nums.length; i++){
            int v1 = nums[i];
            max = Math.max(v1, max + nums[i]);
            maxsum = Math.max(maxsum, max);
            min = Math.min(v1, min + nums[i]);
            minsum = Math.min(minsum, min);
           
        }
        if(maxsum < 0){
            return maxsum;
        }
        int ans = sum - minsum;
        return Math.max(ans, maxsum);
    }
}