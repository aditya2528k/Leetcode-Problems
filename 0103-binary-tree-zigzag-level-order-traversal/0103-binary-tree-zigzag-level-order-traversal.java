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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean ltr = true;
        while (!q.isEmpty()) {
            int level = q.size();
            int[] arr = new int[level];
            for (int i = 0; i < level; i++) {
                TreeNode t = q.poll();
                int index = ltr ? i : level - 1 - i;
                arr[index] = t.val;
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }
            List<Integer> temp = new ArrayList<>();
            for (int x : arr) {
                temp.add(x);
            }
            res.add(temp);
            ltr = !ltr;
        }
        return res;
    }
}