class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<9;i++){
            q.offer(i);
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int temp=q.poll();
            
            if(temp>=low && temp<=high){
                res.add(temp);
            }
            int ld=temp%10;
            if(ld+1<=9){
                q.offer(temp*10+(ld+1)); // ld=last digit
            }
        }
        return res;
    }
}