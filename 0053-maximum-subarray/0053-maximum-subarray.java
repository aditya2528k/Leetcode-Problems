class Solution {
    public int maxSubArray(int[] nums) {
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num : nums){
            current += num;
            maxSum = Math.max(maxSum, current);
            if(current < 0){
                current = 0;
            } 
        }
        return maxSum;
    }
}