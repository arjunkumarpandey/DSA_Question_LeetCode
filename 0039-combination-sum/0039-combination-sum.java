class Solution 
{
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        //if(candidates[0]>target)  return null;
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
         unique(candidates,target,0,ans,new ArrayList<>());
         return ans;
    }

    public void unique(int[] arr, int target,int ind,List<List<Integer>>ans,List<Integer>ds)
    {
        if(ind==arr.length)
        {
            if(target==0) 
            {
               ans.add(new ArrayList<>(ds));
            }
            return;
        }
         if(arr[ind]<=target)
         {
             ds.add(arr[ind]);
             unique(arr,target-arr[ind],ind,ans,ds);
             ds.remove(ds.size()-1);
         }
         unique(arr,target,ind+1,ans,ds);
    }
}