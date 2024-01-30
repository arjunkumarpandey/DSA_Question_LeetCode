class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        if(n<3) return Integer.parseInt(tokens[0]);
        Stack<Integer> st=new Stack<>();
        int result=0, i=0;
        while(i<n)
        {
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/"))
            {
                int a=Integer.parseInt(tokens[i]);
                st.push(a);
            }
            else
            {
                int first=st.pop();
                int second=st.pop();
                switch(tokens[i]) 
                {
                        case "+":
                            result=second+first;
                            break;
                        case "-":
                            result=second-first;
                            break;
                        case "*":
                            result=second*first;
                            break;
                        case "/":
                            result=second/first;
                            break;
                }
                st.push(result);            
            }
            i++;
        }
        return result;
    }
}