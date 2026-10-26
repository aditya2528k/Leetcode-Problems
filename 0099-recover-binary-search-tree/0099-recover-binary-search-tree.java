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
    TreeNode prev;
    TreeNode a1 = null;
    TreeNode a2 = null;
    TreeNode b1 = null;
    TreeNode b2 = null;
    int i = 0;
    public void recoverTree(TreeNode root) {
        fun(root);
        if(i == 1){
            int temp = a1.val;
            a1.val = a2.val;
            a2.val = temp;
        }else{
            int temp = a1.val;
            a1.val = b2.val;
            b2.val = temp;
        }
    }
    public void fun(TreeNode t){
        if(t == null){
            return;
        }
        fun(t.left);
        if(prev == null){
          prev = t;
        }else{
            if(t.val < prev.val){
                if(i == 0){
                    a1 = prev;
                    a2 = t;
                    i++;
                }else{
                    b1 = prev;
                    b2 = t;
                    i++;
                }
            }
        }
        prev = t;
        fun(t.right);
    }
}