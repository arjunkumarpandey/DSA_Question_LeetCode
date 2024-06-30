class DSU{
    int[] parent;
    int component;
    
    DSU(int n){
        parent=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        component=n;
    }

    int find(int x){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=find(parent[x]);
    }

    void union(int x,int y){
        int x_parent=find(x);
        int y_parent=find(y);

        if(x_parent!=y_parent){
            parent[y_parent]=x_parent;
        }
        component--;
    }

    boolean isComponentOne(){
        return component==1;
    }
}
class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (v1, v2) -> v2[0] - v1[0]);

        DSU Alic=new DSU(n);
        DSU Bob=new DSU(n);

        int edgesCount=0;

        for(int[] edge:edges){
            int type=edge[0];
            int u=edge[1];
            int v=edge[2];

            if(type==3){
                boolean add=false;

                //Alic
                if(Alic.find(u)!=Alic.find(v)){
                    Alic.union(u,v);
                    add=true;
                }
                //Bob
                if(Bob.find(u)!=Bob.find(v)){
                    Bob.union(u,v);
                    add=true;
                }

                if(add){
                    edgesCount++;
                }
            }
            else if(type==2){
                if(Bob.find(u)!=Bob.find(v)){
                    Bob.union(u,v);
                    edgesCount++;
                } 
            }else{
                if(Alic.find(u)!=Alic.find(v)){
                    Alic.union(u,v);
                    edgesCount++;
                }     
            }
        }
        if(Alic.isComponentOne() && Bob.isComponentOne()){
            return edges.length-edgesCount;
        }
        return -1;
    }
}