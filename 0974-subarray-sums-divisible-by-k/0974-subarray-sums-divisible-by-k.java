class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int n=nums.length;
       HashMap<Integer,Integer> mp=new HashMap<>();
       mp.put(0,1);
       int sum=0;
       int result=0;

       for(int i=0;i<n;i++){
          sum+=nums[i];
          int remainder=sum%k;

          if(remainder < 0) {
                remainder+=k;
            }
          if(mp.containsKey(remainder)){
              result+=mp.get(remainder);
              mp.put(remainder,mp.get(remainder)+1);
           }
           else{
              mp.put(remainder,1);
            }
       } 
       return result;
    }
}