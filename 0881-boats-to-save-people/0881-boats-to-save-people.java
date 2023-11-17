class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int max = 0;
       Arrays.sort(people);
       int j = people.length - 1;
       int i = 0;
       while (i <= j) {
           if (i == j) {
               max++;
               j--;
               i++;
           } else if (people[j] == limit) {
               max++;
               j--;
           } else if (people[i] + people[j] <= limit) {
               max++;
               i++;
               j--;
           } else {
               max++;
               j--;
           }
       }
       return max;
    }
}
