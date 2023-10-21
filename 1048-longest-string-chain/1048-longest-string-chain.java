import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparing(String::length));
        int[] dp = new int[words.length];
        int sum = 0;

        for (int i = 0; i < words.length; i++) {
            dp[i] = 1; 
            for (int j = 0; j < i; j++) {
                if (isPred(words[j], words[i])) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            sum = Math.max(sum, dp[i]);
        }

        return sum;
    }
    boolean isPred(String prev, String curr)
    {
        int M=prev.length();
        int N=curr.length();

        if(M>=N || N-M!=1)
        {
            return false;
        }

        int i=0,j=0;
        while(i<M && j<N)
        {
            if(prev.charAt(i)==curr.charAt(j))
            i++;

            j++;
        }
        return i==M;
    }
}