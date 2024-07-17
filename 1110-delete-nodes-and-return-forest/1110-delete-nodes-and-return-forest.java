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
    TreeNode solver(TreeNode root,List<TreeNode> result,Set<Integer> st){
        if(root==null){
            return null;
        }
        root.left=solver(root.left,result,st);
        root.right=solver(root.right,result,st);

        if(st.contains(root.val)){
            if(root.left!=null){
                result.add(root.left);
            }
            if(root.right!=null){
                result.add(root.right);
            }
            return null;
        }

        return root;  
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result=new ArrayList<>();
        Set<Integer> st=new HashSet<>();

        for(int num:to_delete){
            st.add(num);
        }
        root=solver(root,result,st);
        if(root!=null){
            result.add(root);
        }
        return result;
    }
    
}