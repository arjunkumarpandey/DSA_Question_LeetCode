// Brute force-O(n^2)
class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
        int count=0;
          for(int j=0;j<n;j++){
             if(nums[j]>=i){
                count++;
             }
          }
          if(count==i){
            return count;
          }
       } 
       return -1;
    }
} 
//Binar Search
/*class Solution {
    int firstOccur(int[] nums,int x){
        int low=0,high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=x){
                high=mid;
            } else{
                low=mid+1;
            }
        }
        return low;
    }
    public int specialArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0,right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            int result=firstOccur(nums,mid);
           
            int count=n-result;
            if(count==mid){
                return mid;
            }
            else if(count>mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
*/
