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
    boolean solver(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p!=null && q!=null && p.val==q.val){
            return solver(p.left, q.left) && solver(p.right, q.right);
        }
        return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
       return solver(p,q); 
    }
}