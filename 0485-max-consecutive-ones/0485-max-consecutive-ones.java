class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int con = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                con = Math.max(con, count);
            }else{
                count = 0;
            }
        }
        return con;
    }
}