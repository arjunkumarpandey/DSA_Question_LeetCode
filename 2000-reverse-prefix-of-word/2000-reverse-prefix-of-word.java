class Solution {
    public String reversePrefix(String word, char ch) {
        int position=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                position=i;
                break;
            }
        }
        if(position!=-1){
           StringBuilder reversed=new StringBuilder(word.substring(0, position+1));
           return reversed.reverse().toString() + word.substring(position + 1); 
        }
        return word;
    }
}