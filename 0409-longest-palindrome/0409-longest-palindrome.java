class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int result=0;
        boolean odd=false;
        for(int value:map.values()){
            if(value%2==0){
                result+=value;
            }
            else{
                result+=value-1;
                odd=true;
            }
        }
        if(odd){
            result+=1;
        }
        return result;
    }
}