class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        StringBuilder result=new StringBuilder();
        for(char c:order.toCharArray()){
            if(mp.containsKey(c)){
                int count=mp.get(c);
                while(count-- >0){
                    result.append(c);
                }
                mp.remove(c);
            }
        }
        for(char c:mp.keySet()){
            int count=mp.get(c);
            while(count-->0){
                result.append(c);
            }
        }
        return result.toString();
    }
}