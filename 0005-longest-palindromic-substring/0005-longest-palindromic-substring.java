class Solution {
    public static String longestPalindrome(String s) {
    int n = s.length();
    boolean[][] table = new boolean[n][n];
    String longestPalindrome = "";

    // base cases
    for (int i = 0; i < n; i++) {
        table[i][i] = true;
        longestPalindrome = s.substring(i, i+1);
    }

    for (int i = 0; i < n-1; i++) {
        if (s.charAt(i) == s.charAt(i+1)) {
            table[i][i+1] = true;
            longestPalindrome = s.substring(i, i+2);
        }
    }

    // general case
    for (int k = 3; k <= n; k++) {
        for (int i = 0; i < n-k+1; i++) {
            int j = i+k-1;
            if (s.charAt(i) == s.charAt(j) && table[i+1][j-1]) {
                table[i][j] = true;
                if (k > longestPalindrome.length()) {
                    longestPalindrome = s.substring(i, j+1);
                }
            }
        }
    }

    return longestPalindrome;
}
}


/*class Main {
    public static String longestPalindrome(String s) {
        char[] str=s.toCharArray();
        
        int n=str.length;
        char[] str2=new char[n];
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>0;j--)
            {
                if(str[i]!=str[j])
                {
                    str[i]=str[j]=0;
                }
            }
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(str[i]==0)
            {
                break;
            }
            else
            {
                str2[j]=str[i];
                j++;
            }
        }
        String str3=str2.toString();
        return str3;
    }
    public static void main(String[] args) {
        String s="babad";
        String str=longestPalindrome(s);
        System.out.println(str);
    }
} */
