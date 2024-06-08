class Solution {
    public long wonderfulSubstrings(String word) {
        long[] count=new long[1024];
        long result=0;
        int curr_xor=0;
        count[curr_xor]=1;

        for(char ch:word.toCharArray()){
            int shift=ch-'a';
            curr_xor ^= 1 << shift;
            result += count[curr_xor];
            for(int i=0;i<10;i++){
                result+=count[curr_xor ^ (1 << i)];
            }
            count[curr_xor]++;
        }
        return result;
    }
}