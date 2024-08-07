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
    boolean solver(TreeNode root){
        if(root.val==0 || root.val==1){
            return root.val==1;
        }
        else if(root.val==3){
            return solver(root.left) && solver(root.right);
        }
        else if(root.val==2){
            return solver(root.left) || solver(root.right);
        }
        return false;
    }
    public boolean evaluateTree(TreeNode root) {
        return solver(root);
    }
}