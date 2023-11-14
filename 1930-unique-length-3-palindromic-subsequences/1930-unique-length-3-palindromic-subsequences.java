class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        Set<Character> res=new HashSet<>();

        for(char ch:s.toCharArray()){
            res.add(ch);
        }
        int result=0;
        for(char letter:res){
            int left=-1;
            int right=-1;
            for(int i=0;i<n;i++) {
                if(s.charAt(i)==letter) {
                    if(left==-1) {
                        left=i;
                    }
                    right=i;
                }
            }

            Set<Character> set = new HashSet<>();
            for(int i=left+1;i<=right-1;i++) {
                set.add(s.charAt(i));
            }
            result += set.size();
        }

        return result;
    }
}