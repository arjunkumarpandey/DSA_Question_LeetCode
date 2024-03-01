class Solution {
    public String maximumOddBinaryNumber(String s) {
       int n=s.length();
       int one=0;
       int zero=0;
       for(int i=0;i<n;i++){
           if(s.charAt(i)=='0'){
               zero++;
           }
           else{
               one++;
           }
       } 
       StringBuilder str=new StringBuilder();
       for(int i=0;i<one-1;i++){
            str.append("1");
        }
        for(int i=0;i<zero;i++){
            str.append("0");
        }
        str.append("1");
        return str.toString();
    }
}