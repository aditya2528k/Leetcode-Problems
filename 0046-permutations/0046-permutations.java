class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> curr = new ArrayList<>();
       boolean[] used = new boolean[nums.length];
       fun(nums, curr, used, res);

       return res;
    }
    void fun(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> res){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        } 
        for(int j = 0; j < nums.length; j++){
            if(used[j]){
                continue;
            }
            curr.add(nums[j]);
            used[j] = true;

            fun(nums, curr, used, res);

            curr.remove(curr.size() - 1);
            used[j] = false;
        }
    }
}