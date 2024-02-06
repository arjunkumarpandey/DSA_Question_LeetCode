class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            if (mp.containsKey(sortedString)) {
                mp.get(sortedString).add(s);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(s);
                mp.put(sortedString, newList);
            }
        }
        for (List<String> list : mp.values()) {
            Collections.sort(list);
        }
         List<List<String>> res=new ArrayList<>();
         for(List<String> list:mp.values()){
             res.add(list);
         }
         return res;
    }
}