class Solution {
    public String removeDuplicateLetters(String s) {
         StringBuilder result = new StringBuilder();
        boolean[] taken=new boolean[26];
        int[] arr=new int[26];
        Arrays.fill(arr, -1);

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            arr[ch-'a']=i;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(taken[idx]==true)
            continue;

            while(result.length() > 0 && ch < result.charAt(result.length() - 1) && arr[result.charAt(result.length() - 1) - 'a'] > i)
            {
                taken[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            result.append(ch);
            taken[idx] = true;
        }
        return result.toString();
    }
}