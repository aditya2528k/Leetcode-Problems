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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode t = root;

        while(t != null || !st.isEmpty()){
            while(t != null){
                st.push(t);
                t = t.left;
            }

            t = st.pop();
            k--;

            if(k == 0){
                return t.val;
            }
            t = t.right;
        }
        return -1;
    }
}