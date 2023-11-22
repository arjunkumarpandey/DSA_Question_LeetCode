class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int n=nums.size();
        Map<Integer,List<Integer>> m=new HashMap();
        int a=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<nums.get(i).size();j++){
                int diag=i+j;
                if (!m.containsKey(diag)) {
                    m.put(diag, new ArrayList<>());
                }
            m.get(diag).add(nums.get(i).get(j));
            a++;
            }        
        }
        int[] result=new int[a];
        int i = 0;
        int diagonal = 0;

        while (m.containsKey(diagonal)) {
            for (int num : m.get(diagonal)) {
                result[i] = num;
                i++;
            }

            diagonal++;
        }
       return result;

    }
}