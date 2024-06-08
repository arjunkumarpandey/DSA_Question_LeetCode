class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0,j=0;
        while(i<version1.length() || j<version2.length()){
            int sum=0,sum2=0;
            while(i<version1.length() && version1.charAt(i)!='.'){
                sum=sum*10+(version1.charAt(i++)-'0');
            }
            while(j<version2.length() && version2.charAt(j)!='.' ){
                sum2=sum2*10+(version2.charAt(j++)-'0');
            }
            if(sum<sum2)    return -1;
            if(sum>sum2)    return 1;

            i++;
            j++;
        }
        return 0;
    }
}