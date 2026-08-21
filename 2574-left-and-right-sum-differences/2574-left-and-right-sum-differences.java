class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left = 0;
        int right = 0;
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
           arr1[i] = left;
           left += nums[i];
        }
        for(int i = nums.length  - 1; i >= 0; i--){
            arr2[i] = right;
            right += nums[i];
        }
        int[] ans  = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = Math.abs(arr1[i] - arr2[i]);
        }
        return ans;
    }
}