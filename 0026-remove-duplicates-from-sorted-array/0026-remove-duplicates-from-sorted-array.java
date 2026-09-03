class Solution {
    public int removeDuplicates(int[] nums) {
       int ans = 1;
       int left = 0;
       for(int right = 1; right < nums.length; right++){
        if(nums[right] != nums[left]){
            nums[left + 1] = nums[right];
            ans++;
            left = left + 1;
        }
       }
       return ans;

    }
}