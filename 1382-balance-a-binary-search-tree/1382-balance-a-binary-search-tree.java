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
    List<Integer> arr;  
    void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        arr.add(root.val);
        inOrder(root.right);
    }

    TreeNode solver(int l,int r){
        if(l>r){
            return null;
        }
        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=solver(l,mid-1);
        root.right=solver(mid+1,r);

        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        arr=new ArrayList<>();
        inOrder(root);

        return solver(0,arr.size()-1);
    }
}