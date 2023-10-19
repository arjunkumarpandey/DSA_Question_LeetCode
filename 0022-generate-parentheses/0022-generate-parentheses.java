class Solution {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> list=new LinkedList<String>(); 
        DFS(n,0,"",list);
        return list;
    }
    public void DFS(int left,int right,String res,List<String> list)
    {
        if(left==0 && right==0)
        {
            list.add(res);
            return;
        }
        if(left>0)
        DFS(left-1,right+1,res+"(",list);
        if(right>0)
        DFS(left,right-1,res+")",list);
    }
}
