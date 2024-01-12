class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String s1=s.toLowerCase();
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(i<n/2 && (s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')){
                a++;
            }
            else if(i>=n/2 && (s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')){
                b++;
            }
        }
        return a==b;
    }
}
