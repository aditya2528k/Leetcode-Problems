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
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        sum(root, 0);
        return ans;
    }
    
    int sum = 0;
    public void sum(TreeNode t, int a){
        
        if(t == null){
            return;
        }
        a = (a * 10) + t.val;
        if(t.left == null && t.right == null){
            ans += a;
        }
        sum(t.left, a);
        sum(t.right, a);
    }
}