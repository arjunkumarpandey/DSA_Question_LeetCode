class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedStr = s.trim();
        StringBuilder str=new StringBuilder();
        for(int i=trimmedStr.length()-1;i>=0;i--){
            if(trimmedStr.charAt(i)!=' '){
                str.append(trimmedStr.charAt(i));
            }
            else{
                break;
            }
        }
        return str.length();
    }
}