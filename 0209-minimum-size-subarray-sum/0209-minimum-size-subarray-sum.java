class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(high < nums.length){
            sum += nums[high];

            while(sum >= target){
                int length = high - low + 1;
                ans = Math.min(ans, length);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}