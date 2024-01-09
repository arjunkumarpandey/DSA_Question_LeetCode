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
    void solver(TreeNode root,  List<Integer>arr){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            arr.add(root.val);
            return;
        }
        solver(root.left,arr);
        solver(root.right,arr);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        solver(root1,arr1);
        solver(root2,arr2);
        return arr1.equals(arr2);
    }
}