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
    boolean tofind(TreeNode root,int high){
        if(root==null){
            return false;
        }
        if(root.val==high){
            return true;
        }
        else if(root.val<high){
            return tofind(root.right,high);
        }
        else{
            return tofind(root.left,high);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
       if(low==high){
           return low;
       }
       int res=0;
       while(high>=low && root!=null){
           if(tofind(root,high)){
               res+=high; 
           }
            high--;
       } 
       return res;
    }
}