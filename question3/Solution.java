/**
 * Returns the count of students who have more absences in history than in math.
 * Compares students via student ID.
*/


public int moreHistoryThanMathAbsences(){
  int count = 0;
  for(int i = 0; i < historyList.size(); i++){
    for(int g = 0; g < mathList.size(); g++){
      if(historyList.get(i).getStudentID() == mathList.get(g).getStudentID()){
        if(historyList.get(i).getAbsences() > mathList.get(g).getAbsences()){
          count++;
        }
      }
    }
  }
  return count;
}
