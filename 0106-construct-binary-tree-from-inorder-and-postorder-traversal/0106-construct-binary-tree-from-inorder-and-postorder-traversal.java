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
    HashMap<Integer, Integer> map = new HashMap<>();
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        idx = postorder.length - 1;
        
        return fun(postorder, 0, inorder.length - 1);
    }
    public TreeNode fun(int[] post, int low, int high){

        if(low > high){
            return null;
        }
        int val = post[idx--];
        TreeNode t = new TreeNode(val);

        int id = map.get(val);

        t.right = fun(post, id + 1, high);
        t.left = fun(post, low, id - 1);

        return t;

    }
}