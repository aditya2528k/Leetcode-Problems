class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2 = new int[nums1.length];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] % 2 == 1){
                min = Math.min(min, nums1[i]);
            }
        }
        if(min == Integer.MAX_VALUE){
            return true;
        }

        for(int x : nums1){
            if(x % 2 == 0 && x < min){
                return false;
            }
        }
        return true;
    }
}