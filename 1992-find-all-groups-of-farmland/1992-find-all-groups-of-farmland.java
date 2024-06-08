class Solution {
    List<List<Integer>> list;
    public int[][] findFarmland(int[][] land) {
        int n=land.length;
        int m=land[0].length;

        list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                if(land[i][j]==1){
                    List<Integer> farmland=new ArrayList<>();
                    farmland.add(i);
                    farmland.add(j);
                    farmland.add(i);
                    farmland.add(j);
                    dfs(land,i,j,farmland);
                    list.add(farmland);
                }
            }
        }
        int[][] result=new int[list.size()][4];
        for(int i=0;i<list.size();i++){
            List<Integer> farm=list.get(i);
            for(int j=0;j<4;j++){
                result[i][j]=farm.get(j);
            }
        }
        return result;
    }

    void dfs(int[][] land,int row,int col,List<Integer> farmland){
        int n=land.length;
        int m=land[0].length;

        if(row<0 || row>=n || col<0 || col>=m || land[row][col]==0){
            return;
        }
        land[row][col]=0;
        farmland.set(3, Math.max(farmland.get(3),col));
        farmland.set(2, Math.max(farmland.get(2),row));
        

        dfs(land, row - 1, col, farmland);
        dfs(land, row + 1, col, farmland);
        dfs(land, row, col + 1, farmland);
        dfs(land, row, col - 1, farmland);
    }
}
