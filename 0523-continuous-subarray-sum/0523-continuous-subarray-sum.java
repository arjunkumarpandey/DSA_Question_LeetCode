class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int mod=0;

        for(int i=0;i<n;i++){
            mod=(mod+nums[i]) % k;
            if(mp.containsKey(mod)){
                int size=i-mp.get(mod);
                if(size>=2){
                    return true;
                }
            }else{
                mp.put(mod,i);
            }
        }
        return false;
    }
}
