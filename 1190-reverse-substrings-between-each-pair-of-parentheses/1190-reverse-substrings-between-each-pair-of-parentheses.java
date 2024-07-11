class Solution {
     public static String reverse(String s,int start,int end){
        String before=s.substring(0,start);
        String toReverse=s.substring(start+1,end);
        String after=s.substring(end+1);
        
        String reversedSubstring=new StringBuilder(toReverse).reverse().toString();
        
        return before+reversedSubstring+after;
    }

    public String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            if(s.charAt(i)==')'){
                s=reverse(s,st.pop(),i);  
                i=i-2;
            }
        }
        return s;
    }
}