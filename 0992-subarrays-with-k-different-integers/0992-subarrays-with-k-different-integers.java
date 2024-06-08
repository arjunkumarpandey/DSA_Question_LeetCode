class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int result=0;
        int n = nums.length;
        int i=0,j=0;
        int i_bada=0;
        while(j<n){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            while(mp.size()>k){
                mp.put(nums[i], mp.get(nums[i]) - 1);
                if(mp.get(nums[i]) == 0){
                    mp.remove(nums[i]);
                }
                i++;
                i_bada=i;
            }
            while(mp.get(nums[i])>1){
                mp.put(nums[i], mp.get(nums[i]) - 1);
                i++;
            }

            if(mp.size()==k){
                result +=(1+i-i_bada);
            }
            j++;
        }
        return result;
    }
}
