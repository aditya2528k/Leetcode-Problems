class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int second = 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                second = max;
                max = nums[i];
                k = i;  
            } else if(nums[i] > second){
                second = nums[i];
            }
        }
        if(max >= second * 2){
            return k;
        }
        return -1;
    }
}