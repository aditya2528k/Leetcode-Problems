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
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean found = false;

        while (!q.isEmpty()) {
            TreeNode t = q.poll();

            if (t.left != null) {
                if (found) {
                    return false;
                }
                q.offer(t.left);
            } else {
                found = true;
            }

            if (t.right != null) {
                if (found) {
                    return false;
                }
                q.offer(t.right);
            } else {
                found = true;
            }
        }

        return true;
    }
}