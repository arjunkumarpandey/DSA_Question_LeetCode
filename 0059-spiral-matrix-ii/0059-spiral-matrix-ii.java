class Solution {
    public int[][] generateMatrix(int n) 
    {
        int[][] arr=new int[n][n];
        int sum=1;
        int top=0, down=n-1, left=0, right=n-1;
        while(left<=right&& top<=down)            
        {
            for(int j=left;j<=right;j++)
            {
                arr[top][j]=sum++;
            }
            top++;
            for(int k=top;k<=down;k++)
            {
                arr[k][right]=sum++;  
            }
            right--;
            if(top<=down){
            for(int m=right;m>=left;m--)
            {
                arr[down][m]=sum++;
                
            }
            }
            down--;
            if(left<=right){
            for(int m=down;m>=top;m--)
            {
                    arr[m][left]=sum++;;
            }
            }
            left++;  
        } 
        return arr;
    }
}