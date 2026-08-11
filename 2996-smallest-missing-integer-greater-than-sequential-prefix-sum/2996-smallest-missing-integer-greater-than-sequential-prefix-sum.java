class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int max  = 0;
        int prefix = nums[0];
       for(int i = 1; i < nums.length; i++){
          if(nums[i] == nums[i - 1] + 1){
            prefix += nums[i];
          }else{
            break; 
          }
        }
        for(int num : nums){
            map.add(num);
        }
        while(map.contains(prefix)){
            prefix++;
        }
        return prefix;
    }
}