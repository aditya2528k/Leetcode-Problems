class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int sum = 0;
        fun(candidates, candidates.length, 0, curr, sum, res, target);
        return res;
    }

    void fun(int[] nums, int n, int index, List<Integer> curr, int sum, List<List<Integer>> res, int target){
        if(index == n){
            return;
        }
        if(sum == target){
            res.add(new ArrayList<>(curr));
            return;
        }    
        fun(nums, n, index + 1, curr, sum, res, target);
        if(nums[index] + sum <= target){
            curr.add(nums[index]);
            sum += nums[index];
            fun(nums, n, index, curr, sum, res, target);
            curr.remove(curr.size() - 1);
            sum -= nums[index];
        }
        return;
    }
}