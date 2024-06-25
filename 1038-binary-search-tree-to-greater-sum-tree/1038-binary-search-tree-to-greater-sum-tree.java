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
    int sum=0;
    void solver(TreeNode root){
        if(root==null){
            return ;
        }

        solver(root.right);

        sum+=root.val;
        root.val=sum;
       
        solver(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        solver(root);
        return root;
    }
}