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
    private int ans = 0;
    
    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        solver(root);
        return ans;
    }

    int[] solver(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        
        int[] leftSum = solver(root.left);
        int[] rightSum = solver(root.right);
        int subtreeSum = leftSum[0] + rightSum[0] + root.val;
        int countRoot = leftSum[1] + rightSum[1] + 1;
        
        int a = subtreeSum / countRoot;
        if (root.val == a) {
            ans++;
        }
        
        return new int[]{subtreeSum, countRoot};
    }
}