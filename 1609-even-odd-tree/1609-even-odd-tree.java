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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean even=true;
        while(!q.isEmpty()){
            int n=q.size();
            int prev;
            if(even){
                prev=Integer.MIN_VALUE;
            }
            else{
                prev=Integer.MAX_VALUE;
            }
             while(n-- > 0){
                TreeNode temp=q.poll();

                if(even && (temp.val%2==0 || temp.val<=prev)){
                    return false;
                }
                if(!even && (temp.val%2==1 || temp.val>=prev)){
                    return false;
                }
                prev=temp.val;
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
            even=!even;
        }
        return true;
    }
}