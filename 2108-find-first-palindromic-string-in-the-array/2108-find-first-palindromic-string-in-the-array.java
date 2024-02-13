class Solution {
    public String firstPalindrome(String[] words) {
       int n=words.length;
       for(int i=0;i<n;i++){
          StringBuilder str=new StringBuilder(words[i]);
          str.reverse();
           String reversed=str.toString();
           if(reversed.equals(words[i])){ 
               return words[i];
           }
       } 
       return "";
    }
}