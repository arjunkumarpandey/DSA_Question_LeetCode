class Solution {
    boolean solver(char[][] board,int i,int j,String word,int k,boolean[][] visited){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j])
            return false;

        if(board[i][j] !=word.charAt(k))
            return false;
        if(k==word.length() - 1)
            return true;

        visited[i][j]=true;
        if(solver(board,i+1,j,word,k+1,visited) || solver(board,i-1,j,word,k+1,visited) ||
            solver(board,i,j+1,word,k+1,visited) ||solver(board,i,j-1,word,k+1,visited))
            return true;

        visited[i][j]=false;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(solver(board,i,j,word,0,visited))
                    return true;
            }
        }
        return false;
    }
}
