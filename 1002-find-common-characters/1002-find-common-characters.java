class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        List<String> result = new ArrayList<>();
        String str=words[0];
    
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=1;j<n;j++){
                for(int k=0;k<words[j].length();k++){
                    if(str.charAt(i)==words[j].charAt(k)){
                        words[j] = words[j].substring(0, k) + '*' + words[j].substring(k + 1);
                        count++;
                        break;
                    }
                }
            }
            if(count==n){
                result.add(String.valueOf(str.charAt(i)));
            }
        }
        return result;
    }
}