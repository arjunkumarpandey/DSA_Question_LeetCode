class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> h=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            } else if(s.charAt(i)=='*'){
                h.push(i);
            } else if(s.charAt(i)==')' && !st.isEmpty()){
                st.pop();
            } else if(s.charAt(i)==')' && st.isEmpty() && !h.isEmpty()){
                h.pop();
            } else{
                return false;
            }
        }
      
        while(!st.isEmpty() && !h.isEmpty()){
            int st1=st.peek();
            int h1=h.peek();
            if(st1<h1) {
                st.pop();
                h.pop();
            } else{
                break;
            }
        }
        
        return st.isEmpty();
    }
}
