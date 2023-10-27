import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();

        int[] result=new int[n1+n2];
        
        for(int i=n1-1;i>=0;i--)
        {
            for(int j=n2-1;j>=0;j--)
            {
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';
                
                int multi=d1*d2;
                
                int sum=multi+result[i+j+1];
                
                result[i+j+1]=sum%10;
                result[i+j]+=sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}