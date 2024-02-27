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
    int maxDiameter=0;
    int solver(TreeNode root){
        if(root==null){
            return 0;
        }
        int left1=solver(root.left);
        int right1=solver(root.right);

        maxDiameter=Math.max(maxDiameter,left1 + right1);

        return Math.max(left1, right1)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        solver(root);
        return maxDiameter;
    }
}