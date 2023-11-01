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
    private List<Integer> modes = new ArrayList<>();
    private int currentVal;
    private int currentCount;
    private int maxCount;
    
    public int[] findMode(TreeNode root) {
        traverse(root);
        
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        
        return result;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        
        traverse(node.left);
        
        if (node.val == currentVal) {
            currentCount++;
        } else {
            currentVal = node.val;
            currentCount = 1;
        }
        
        if (currentCount > maxCount) {
            modes.clear();
            modes.add(currentVal);
            maxCount = currentCount;
        } else if (currentCount == maxCount) {
            modes.add(currentVal);
        }
        
        traverse(node.right);
    }
}