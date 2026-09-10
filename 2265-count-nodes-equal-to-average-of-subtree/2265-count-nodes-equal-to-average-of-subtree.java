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
    static class pair{
        int sum;
        int count;
        pair(int sum, int count){
            this.sum = sum;
            this.count = count;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        avg(root);
        return ans;
    }
    public pair avg(TreeNode root){
        if(root == null){
            return new pair(0, 0);
        }

        pair left = avg(root.left);
        pair right = avg(root.right);
        int sum = root.val + left.sum + right.sum;
        int count = 1 + left.count + right.count;
        if(root.val == sum / count){
            ans++;
        }
        return new pair(sum, count);
    }
}