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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        fun(root, pre);
        return pre;
    }
    public void fun(TreeNode root, List<Integer> pre){
        if(root == null){
            return;
        }
        pre.add(root.val);
        fun(root.left, pre);
        fun(root.right, pre);
    }
}