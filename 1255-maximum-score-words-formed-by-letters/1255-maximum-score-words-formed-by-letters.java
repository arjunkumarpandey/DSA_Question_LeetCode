class Solution {
    int n;
    int result;
    void solver(int i,String[] words, Map<Character,Integer> letter,int[] score,int currResult){
        if(i>=n){
            result = Math.max(result, currResult);
            return;
        }

        int j=0;
        int tempResult=0;
        Map<Character,Integer> templetter=new HashMap<>(letter);
        while(j<words[i].length()){
            char ch=words[i].charAt(j);
           if (templetter.containsKey(ch) && templetter.get(ch) > 0) {
                templetter.put(ch, templetter.get(ch) - 1);
                tempResult+=score[ch-'a'];
            }else{
                break;
            }
            j++;
        }
        if(j==words[i].length()){
            solver(i+1,words,templetter,score,currResult+tempResult);
        }
        solver(i+1,words,letter,score,currResult);
    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        Map<Character,Integer> letter=new HashMap<>();
        for(int i=0;i<letters.length;i++){
            letter.put(letters[i],letter.getOrDefault(letters[i],0)+1);
        }
        n=words.length;
        result=Integer.MIN_VALUE;

        solver(0,words,letter,score,0);

        return result;
    }
}
