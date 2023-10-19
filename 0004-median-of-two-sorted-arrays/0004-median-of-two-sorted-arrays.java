import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] c= new int[n+m];
        int sum=0;
        int d=0;
        double e=0;
        for(int i=0;i<n;i++)
        {
            c[i]=nums1[i];
        }
         for(int i=0;i<m;i++)
        {
            c[i+n]=nums2[i];
        }
        Arrays.sort(c);
        sum=m+n;
        if(sum%2==0){
          d=sum/2;
          e=(c[d]+c[d-1])/2d;
        }
        else{
            d=sum/2;
            e=c[d];
        }
        return e;
    }
}