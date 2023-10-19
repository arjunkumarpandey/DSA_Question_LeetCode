class Solution {
    public boolean isValid(String s) {
        char[] str = s.toCharArray();
       Stack<Character> s1 = new Stack<Character>();
     
       for(char c:str)
       {
           if(c=='(' || c=='{' || c=='[')
           s1.push(c);
           else if(c==')' && !s1.isEmpty() && s1.peek()=='(')
           s1.pop();
            else if(c==']'  && !s1.isEmpty() && s1.peek()=='[')
           s1.pop();
            else if(c=='}'  && !s1.isEmpty() && s1.peek()=='{')
           s1.pop();
           else
           return false;
        
               
           
       }
       return s1.isEmpty();
    }
}