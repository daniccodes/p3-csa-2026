public int  getPointsForRow(int targetRow){
  int sum = 0;
  boolean same = true;
  for(int i = 0; i< board[targetRow].length;i++){
    sum += board[targetROw][i].getPoints();

    if(!board[targetRow][i].getColor().equals(board[targetRow][0].getColor())){
      same = false;
    }
  }
  if(same){
    return sum*2
  }
  else{
    return sum;
  }
}
