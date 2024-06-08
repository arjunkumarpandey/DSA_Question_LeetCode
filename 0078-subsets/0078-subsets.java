class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
       List<List<Integer>> result=new ArrayList<>();
       result.add(new ArrayList<>());
       
       for(int num:nums){
           int size=result.size();
            for(int j=0;j<size;j++){
                 List<Integer> temp=new ArrayList<>(result.get(j));
                temp.add(num);
                result.add(temp);
            }

       } 
       return result;
    }
}