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
        if(p.val < q.val){
            fun(root, p, q);
        }else{
            fun(root, q, p);
        }
        return ans;
    }
    public void fun(TreeNode t, TreeNode p, TreeNode q){
        if(t == null){
            return;
        }
        if(t == p || t == q){
            ans = t;
            return;
        }
        if(t.val < p.val){
            fun(t.right, p, q);
        }else if(t.val > q.val){
            fun(t.left, p , q);
        }
        else{
            ans = t;
            return;
        }
    }
}