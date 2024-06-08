class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int sum=0;   
        for(int i=0;i<n;i++){
            int result=0;
            for(int j=i;j<n;j++){
                result+=nums[j];
                if(result==goal){
                    sum++;
                }
                
            }
        }
        return sum;
    }
}

// O(n) TC
// O(1) SC
/*class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int prefixZeros = 0;
        int windowSum = 0;
        int count = 0;
        
        int i = 0, j = 0;
        
        while (j < nums.length) {
            windowSum += nums[j];
            
            while (i < j && (nums[i] == 0 || windowSum > goal)) {
                if (nums[i] == 1) {
                    prefixZeros = 0;
                } else {
                    prefixZeros += 1;
                }
                
                windowSum -= nums[i];
                i++;
            }
            
            if (windowSum == goal) {
                count += 1 + prefixZeros;
            }
            j++;
        }
        
        return count;
    }
}*/