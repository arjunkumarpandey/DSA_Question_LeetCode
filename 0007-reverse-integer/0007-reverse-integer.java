class Solution {
    public static int reverse(int x) {
        
        int rev=0;
        while(x != 0)   
           {  
                int remainder = x % 10;  
             if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && remainder < -8)) return 0;
                rev = rev * 10 + remainder;  
                x = x/10;  
            } 
            return rev;
    }
}