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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        fun(root);
        return ans;
    }
    int sum = 0;
    public int fun(TreeNode t){
        if(t == null){
            return 0;
        }
        int left = Math.max(0, fun(t.left));
        int right = Math.max(0, fun(t.right));

        int curr = t.val + left + right;
        ans = Math.max(ans, curr);

        return t.val + Math.max(left, right);
    }
}