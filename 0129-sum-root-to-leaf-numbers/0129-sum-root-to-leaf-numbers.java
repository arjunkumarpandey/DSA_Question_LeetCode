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
    int result=0;
    void solver(TreeNode root,int sum){
        if(root==null){
            return;
        }
        sum=sum*10+root.val;
        if(root.left == null && root.right == null) {
            result +=sum;
            return;
        }
        solver(root.left,sum);
        solver(root.right,sum);
    }
    public int sumNumbers(TreeNode root) {
        solver(root,0);
        return result;
    }
}