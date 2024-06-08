class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
      Map<String,Integer> mp=new HashMap<>();  
      for(String s:dictionary){
        mp.put(s,mp.getOrDefault(s,0)+1);
      }
     /*  int n=dictionary.isEmpty() ? 0 : dictionary.get(0).length();
       for(String s:dictionary){
            n=Math.min(n,s.length());
        }*/

      String[] words=sentence.split(" ");
      StringBuilder str=new StringBuilder();

      for(int i=0;i<words.length;i++){
        String temp=words[i];
        boolean flag=false;
            for(int j=1;j<=temp.length();j++){
                String sub=temp.substring(0,j);
                if(mp.containsKey(sub)){
                    str.append(sub);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                str.append(temp);
            }
            if(i<words.length-1){
                str.append(" ");
            }
      }

      return str.toString();
    }
}