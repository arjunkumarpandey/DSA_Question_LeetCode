class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
      int Student_One=0;
      int student_Zero=0;
      for(int i=0;i<students.length;i++){
        if(students[i]==1){
            Student_One++;
        }
        else{
            student_Zero++;
        }
      }
      for(int i=0;i<sandwiches.length;i++){
        if(sandwiches[i]==1 && Student_One>0){
            Student_One--;
        }
        else if(sandwiches[i]==0 && student_Zero>0){
            student_Zero--;
        }
        else{
            return sandwiches.length-i;
        }
      }
      return 0;
    }
}