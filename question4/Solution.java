/**
 * Calculates points for "targetRow".
 * Returns double points if all spaces in "targetRow" are the same color.
*/

public int  getPointsForRow(int targetRow){
  int sum = 0;
  boolean same = true;

  for(int i = 0; i < board[targetRow].length; i++){
    sum += board[targetRow][i].getPoints();

    if(!board[targetRow][i].getColor().equals(board[targetRow][0].getColor())){
      same = false;
    }
  }
  if(same){
    return sum * 2
  }
  else{
    return sum;
  }
}
