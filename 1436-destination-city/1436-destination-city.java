class Solution {
    public String destCity(List<List<String>> paths) {
     Set<String> str = new HashSet<>();
        for (List<String> res : paths) {
            str.add(res.get(0));
        }

        String answer = "";
        for (List<String> res : paths) {
            for (int i = 0; i < res.size(); i++) {
                if (str.contains(res.get(i))) {
                    continue;
                } else {
                    answer = res.get(i);
                    break;
                }
            }
        }
        return answer;
    }
}