class Solution {
    public int[] getNSR(int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] NSR=new int[n];
        for(int i=n-1;i>=0;i--){
            if(st.empty()){
                NSR[i]=n;
            }
            else{
                while(!st.empty() && heights[st.peek()] >= heights[i]){
                    st.pop();
                }
                if(st.empty()){
                    NSR[i]=n;
                }else{
                    NSR[i]=st.peek();
                }
            }
            st.push(i);
        }
        return NSR;
    }
    public int[] getNSL(int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] NSL=new int[n];
        for(int i=0;i<n;i++){
            if(st.empty()){
                NSL[i]=-1;
            }
            else{
                while(!st.empty() && heights[st.peek()] >= heights[i]){
                    st.pop();
                }
                if(st.empty()){
                    NSL[i]=-1;
                }else{
                    NSL[i]=st.peek();
                }
            }
            st.push(i);
        }
        return NSL;
    }
    public int findMaxArea(int[] heights){
        int n=heights.length;
        int[] NSR=getNSR(heights);
        int[] NSL=getNSL(heights);

        int max_Area=0;
        for(int i=0;i<n;i++){
            int a=heights[i]*(NSR[i]-NSL[i]-1);
            max_Area=Math.max(a,max_Area);
        }
        return max_Area;

    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0)
            return 0;

        int n=matrix.length;
        int m=matrix[0].length;
        
        int[] heights=new int[m];
        for(int i=0;i<m;i++){
            heights[i] = (matrix[0][i] == '1') ? 1 : 0;
        }

        int maxArea=findMaxArea(heights);

        for(int row=1;row<n;row++){
            for(int col=0;col<m;col++){
                if(matrix[row][col]=='0'){
                    heights[col]=0;
                }
                else{
                    heights[col]+=1;
                }
            }
            maxArea=Math.max(maxArea,findMaxArea(heights));
        }
        return maxArea;
    }
}