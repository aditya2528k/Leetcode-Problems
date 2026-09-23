class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int i : nums){
        sum += i;
        }
        int low = 0;
        int total = sum - x;
        int add = 0;
        int max = -1;
        for(int high = 0; high < nums.length; high++){
            add += nums[high];

            while(low <= high && add > total){

                add -= nums[low];
                low++;
            }
            if(add == total){
              max = Math.max(max, high - low + 1);
            }
        }
        if(max == -1){
            return -1;
        }
        return nums.length - max;
    }
}