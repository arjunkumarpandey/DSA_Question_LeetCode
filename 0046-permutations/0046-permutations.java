class Solution {
    void solver(int[] nums,List<Integer> temp,List<List<Integer>> list){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                solver(nums,temp,list);
                temp.remove(temp.size()-1);
            }
        }
 
        }
    public List<List<Integer>> permute(int[] nums) { 
        List<List<Integer>> list=new ArrayList<>();  
        solver(nums,new ArrayList<>(),list);
        return list;
    }
}