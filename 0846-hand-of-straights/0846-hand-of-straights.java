class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize != 0){
            return false;
        }

        TreeMap<Integer,Integer> mp=new TreeMap<>();
        for(int num:hand){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        while(!mp.isEmpty()){
            int curr=mp.firstKey();

            for(int i=0;i<groupSize;i++){
                if(!mp.containsKey(curr+i)){
                    return false;
                }
                mp.put(curr+i,mp.get(curr+i)-1);
                if(mp.get(curr+i)==0){
                    mp.remove(curr + i);
                }
            }
        }
        return true;
    }
}