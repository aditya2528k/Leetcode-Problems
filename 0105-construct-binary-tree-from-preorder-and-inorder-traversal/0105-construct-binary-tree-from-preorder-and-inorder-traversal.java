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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return fun(preorder, 0, inorder.length - 1);
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    int idx = 0;
    public TreeNode fun(int[] pre, int low, int high) {
        if (low > high) {
            return null;
        }
        int val = pre[idx++];
        TreeNode t = new TreeNode(val);

        int id = map.get(val);
        t.left = fun(pre, low, id - 1);
        t.right = fun(pre, id + 1, high);
        return t;
    }
}