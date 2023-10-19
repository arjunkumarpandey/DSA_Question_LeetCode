import java.util.*;


public class Solution
{
    static public int[] twoSum(int[] num, int target)
    {
        int n=num.length;
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
                int a=num[i]+num[j];
                if(a==target)
                {
                  return new int[] { i, j };
                }
           }
       }
      return new int[] {};
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] num=new int[n];
		for(int i=0;i<n;i++)
		{
		    num[i]=sc.nextInt();
		}
		int target=sc.nextInt();
	
        int[] indices = twoSum(num, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
        
	}
}
