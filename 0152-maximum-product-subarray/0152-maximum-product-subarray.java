class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        for(int i =1; i < nums.length; i++){
            int v1 = nums[i] * min;
            int v2 = nums[i] * max;
            int v3 = nums[i];
            max = Math.max(v1, Math.max(v2, v3));
            min = Math.min(v1, Math.min(v2, v3));
            ans = Math.max(ans, Math.max(max, min));
        }

        return ans;
    }
}