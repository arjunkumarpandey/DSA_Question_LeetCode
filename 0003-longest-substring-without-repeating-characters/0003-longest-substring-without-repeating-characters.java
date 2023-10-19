class Solution {
     public static int lengthOfLongestSubstring(String s) {
        int L=0,R=0;
        Set<Character> check=new HashSet<>();
        int sum=0;
        while(R<s.length())
        {
            char ch=s.charAt(R);
            if(check.add(ch))
            {
                sum=Math.max(sum,R-L+1);
                R++;
            }
            else{
                while(s.charAt(L)!=ch){
                    check.remove(s.charAt(L));
                    L++;
                }
                  check.remove(ch);
                    L++;
            }
        }
        return sum;
    }
}