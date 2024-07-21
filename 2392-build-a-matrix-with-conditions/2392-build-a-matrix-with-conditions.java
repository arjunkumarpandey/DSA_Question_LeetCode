class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> topoRow=topologicalSort(rowConditions,k);
        List<Integer> topoCol=topologicalSort(colConditions,k);

        if(topoRow.isEmpty() || topoCol.isEmpty()){
            return new int[][]{};
        }

        int[][] result=new int[k][k];
        Map<Integer,Integer> colIndex=new HashMap<>();
        for(int i=0;i<topoCol.size();i++){
            colIndex.put(topoCol.get(i),i);
        }

        for(int i=0;i<topoRow.size();i++){
            int j=colIndex.get(topoRow.get(i));
            result[i][j]=topoRow.get(i);
        }

        return result;
    }

    List<Integer> topologicalSort(int[][] graph, int k){
        Map<Integer,List<Integer>> adj=new HashMap<>();
        for(int[] condition:graph){
            adj.computeIfAbsent(condition[0],n->new ArrayList<>()).add(condition[1]);
        }

        List<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int[] visited=new int[k+1];
        boolean[] cycle={false};

        for(int i=1;i<=k;i++){
            if(visited[i]==0){
                dfs(i,adj,visited,cycle,st);
                if(cycle[0]){
                    return new ArrayList<>();
                }
            }
        }

        while(!st.isEmpty()){
            list.add(st.pop());
        }

        return list;

    } 

    void dfs(int i, Map<Integer,List<Integer>> adj,int[] visited,boolean[] cycle,Stack<Integer> st){
        visited[i]=1;
        for(int neighbor: adj.getOrDefault(i,new ArrayList<>())){
            if(visited[neighbor]==0){
                dfs(neighbor,adj,visited,cycle,st);
            }else if(visited[neighbor]==1){
                cycle[0]=true;
                return;
            }
        }
        visited[i]=2;
        st.push(i);
    }
}