class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m != n){
            return false;
        }
        int[] ch=new int[26];

        for(int i=0;i<m;i++){
            ch[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<n;i++){
            ch[t.charAt(i) - 'a']--;
        }
        for(int count:ch){
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}
