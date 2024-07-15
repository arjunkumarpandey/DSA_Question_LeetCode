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
    public TreeNode createBinaryTree(int[][] descriptions) {
        int rootNode=descriptions[0][0];
        Map<Integer,TreeNode> mp=new HashMap<>();
        Set<Integer> st=new HashSet<>();

        for(int[] desc:descriptions){
            int root=desc[0];
            int node=desc[1];
            int isLeft=desc[2];

            st.add(node);

            mp.putIfAbsent(root, new TreeNode(root));
            mp.putIfAbsent(node, new TreeNode(node));

            if (isLeft == 1) {
                mp.get(root).left = mp.get(node);
            } else {
                mp.get(root).right = mp.get(node);
            }
            
        }
        for(int[] desc:descriptions){
            if(!st.contains(desc[0])){
                rootNode=desc[0];
                break;
            }
        }
        return mp.get(rootNode);
    }
}