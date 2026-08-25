class Solution {
    public int missingMultiple(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
       int ans = k;
       for(int i : nums){
        set.add(i);
       }
       while(set.contains(ans)){
        ans += k;
       }
       return ans;
    
    }
}