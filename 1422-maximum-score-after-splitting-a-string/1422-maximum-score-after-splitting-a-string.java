class Solution {
    public int maxScore(String s) {
        int zero=0;
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') {
                ones++;
            }
        }
        int res=0;
        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i)=='0') {
                zero++;
            }
            else{
                ones--;
            }
            res=Math.max(res,zero+ones);
        }
        return res;
    }
}
