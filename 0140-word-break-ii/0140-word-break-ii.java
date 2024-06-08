class Solution {
    List<String> result;
    HashSet<String> st;

    void solver(int i,String currSentence,String s){
        if(i>=s.length()){
            result.add(currSentence);
            return;
        }
        
        for(int j=i;j<s.length();j++){
            String currWord=s.substring(i,j+1);
            if(st.contains(currWord)){
                String tempSentence=currSentence;
                if(!currSentence.isEmpty()){
                    currSentence+=" ";
                }
                currSentence+=currWord;
                solver(j+1,currSentence,s);
                currSentence=tempSentence;

            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        result=new ArrayList<>();
        st=new HashSet<>();
        for(String sc:wordDict){
            st.add(sc);
        }
        String currSentence="";

        solver(0,currSentence,s);
        return result;
    }
}