class Solution {
    public String getSmallestString(String s) {
        char[] arr=s.toCharArray();
    
       for(int i=0;i<arr.length-1;i++){
        int first=arr[i]-'0';
        int second=arr[i+1]-'0';
          if(first%2==second%2 && first>second){
            char temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            break;
          }
       } 
       return new String(arr);
    }
}