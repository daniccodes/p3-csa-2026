/**
 * Returns the username with hyphens and the character before each hyphen removed.
 */

public String getShortenedName(){
  String result = "";
  for(int i = 0; i < username.length(); i++){
    if (username.substring(i, i + 1).equals("-")){
      result = result.substring(0, result.length() -1);
    }
    else{
      result += username.substring(i, i + 1);
    }
      
  }
  return result;
}
