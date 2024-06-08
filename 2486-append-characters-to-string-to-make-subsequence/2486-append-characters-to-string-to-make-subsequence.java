class Solution {
    public int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0,j=0;
        while(j<m && i<n){
            if(t.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return m-j;
    }
}