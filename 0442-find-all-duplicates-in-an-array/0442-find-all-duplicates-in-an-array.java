class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums) {
            if(mp.containsKey(num)){
                result.add(num);
            }
            else{
                mp.put(num,mp.getOrDefault(num,0)+1);
            }
        }
        return result;
    }    
}

