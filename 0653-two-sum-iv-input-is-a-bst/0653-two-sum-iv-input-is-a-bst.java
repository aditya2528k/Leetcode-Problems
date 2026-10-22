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
    Stack<TreeNode> asc = new Stack<>();
    Stack<TreeNode> desc = new Stack<>();
    public boolean findTarget(TreeNode root, int k) {
        TreeNode t = root;
        while(t != null){
            asc.push(t);
            t = t.left;
        }
        t = root;
        while(t != null){
            desc.push(t);
            t = t.right;
        }
        int i = small();
        int j = big();

        while(i < j){
            if(i + j == k){
                return true;
            }else if(i + j > k){
                j = big();
            }
            else{
                i = small();
            }
        }
        return false;
    }
    public int small() {
        TreeNode s = asc.peek();
        asc.pop();
        TreeNode rightchild = s.right;
        while (rightchild != null) {
            asc.push(rightchild);
            rightchild = rightchild.left;
        }
        return s.val;
    }
    public int big() {
        TreeNode b = desc.peek();
        desc.pop();
        TreeNode leftchild = b.left;
        while (leftchild != null) {
            desc.push(leftchild);
            leftchild = leftchild.right;
        }
        return b.val;
    }
}