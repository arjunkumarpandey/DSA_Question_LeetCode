class Solution {
    public List<List<String>> solveNQueens(int n){
        List<List<String>> result=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] row:board){
            Arrays.fill(row, '.');
        }
        solver(board, result, 0);
        return result;
    }
    void solver(char[][] board,List<List<String>> result,int col){
        if(col==board.length){
            addSol(board,result);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                solver(board,result,col+1);
                board[row][col]='.';
            }
        }
    }
    boolean isSafe(int row,int col,char[][] board){
        // horizontal check
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        // vertical check
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //uper left diagnol check
        int r=row;
        for(int i=col;i>=0 && r>=0;i--,r--){
            if(board[r][i]=='Q') {
                return false;
            }
        }
        // upper right diagnol check
        r=row;
        for(int i=col;i<board.length && r>=0;i++,r--){
            if(board[r][i]=='Q'){
                return false;
            }
        }
        // lower left diagnol check
        r=row;
        for(int i=col;i>=0 && r<board.length;i--,r++){
            if(board[r][i]=='Q'){
                return false;
            }
        }
        // lower right diagnol
        r=row;
        for(int i=col;i<board.length && r<board.length;i++,r++){
            if(board[r][i]=='Q'){
                return false;
            }
        }
        return true;
    }
    void addSol(char[][] board,List<List<String>> result){
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(String.valueOf(row));
        }
        result.add(solution);
    }
}
