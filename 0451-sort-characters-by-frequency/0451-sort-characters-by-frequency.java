class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> pq=new PriorityQueue<>((a, b)-> b.getValue()- a.getValue());
        for(char c:s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        pq.addAll(mp.entrySet());
        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            int freq = entry.getValue();
            char ch = entry.getKey();
            while (freq--> 0) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
