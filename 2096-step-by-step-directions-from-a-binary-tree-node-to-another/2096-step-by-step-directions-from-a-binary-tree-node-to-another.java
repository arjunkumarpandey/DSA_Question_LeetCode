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
    boolean solver(TreeNode root,StringBuilder path,int target){
        if(root==null){
            return false;
        }
        if(root.val==target){
            return true;
        }
        path.append('L');
        if(solver(root.left,path,target)){
            return true;
        }
        path.deleteCharAt(path.length()-1);

        path.append('R');
        if(solver(root.right,path,target)){
            return true;
        }
        path.deleteCharAt(path.length()-1);
        return false;
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder rootToSource=new StringBuilder();
        StringBuilder rootToDestination=new StringBuilder();

        solver(root,rootToSource,startValue);
        solver(root,rootToDestination,destValue);

        int index=0;
        while(index<rootToSource.length() && index<rootToDestination.length() && rootToDestination.charAt(index)==rootToSource.charAt(index)){
            index++;
        }

        StringBuilder result=new StringBuilder();
        for(int i=0;i<rootToSource.length()-index;i++){
            result.append('U');
        }
        for(int i=index;i<rootToDestination.length();i++){
            result.append(rootToDestination.charAt(i));
        }
        return result.toString();
    }
}