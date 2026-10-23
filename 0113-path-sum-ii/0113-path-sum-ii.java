/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans.clear();
        fun(root, targetSum, new ArrayList<>());
        return ans;
    }
    public void fun(TreeNode t, int sum, List<Integer> list){
        if(t == null){
            return;
        }
        list.add(t.val);
        sum -= t.val;

        if(t.left == null && t.right == null && sum == 0){
            ans.add(new ArrayList<>(list));
        }else{
            fun(t.left, sum, list);
            fun(t.right, sum, list);
           
        }
        list.remove(list.size() - 1);
    }
}