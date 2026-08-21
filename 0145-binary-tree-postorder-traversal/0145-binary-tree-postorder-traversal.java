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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        postOrder(root, in);
        return in;
    }
    private void postOrder(TreeNode root, List<Integer> in){
        if(root == null){
            return;
        }
        
        postOrder(root.left, in);
        postOrder(root.right, in);
        in.add(root.val);
    }
}