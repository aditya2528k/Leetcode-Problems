/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans  = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        fun(root, p, q);
        return ans;
    }
    public int fun(TreeNode t, TreeNode p, TreeNode q){
        if(t == null){
            return 0;
        }
        int left = fun(t.left, p, q);
        int right = fun(t.right, p, q);
        int self = 0;
        if(t == p || t == q){
            self = 1;
        }
        int total = left + right + self;
        if(total == 2 && ans == null){
            ans  = t;
        }
           return total;
    }
}