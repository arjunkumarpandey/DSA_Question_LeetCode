class Solution {
    public boolean isPalindrome(int x) 
		{
			if(x<0)
			return false;
      int n=x;
	    int sum=0,r;
	    while(x!=0)
	    {
	    r=x%10;
	    sum=(sum*10)+r;
	    x/=10;	
	    }
	    if(n==sum)
	    return true;
	    else
	    return false;
    }
}