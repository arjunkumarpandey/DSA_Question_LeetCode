//without inbuilt function used
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

/* By using inbuilt funtion
class Solution {
    public boolean isPalindrome(String s) {
       String onlyAlphabets = s.replaceAll("[^a-zA-Z0-9]", "");
       String str = onlyAlphabets.toLowerCase();
       int i=0,j=str.length()-1;
       while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
       }
       return true;
    }
}*/
