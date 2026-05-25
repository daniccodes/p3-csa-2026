/**
 * Creates a new account with a unique username.
 *Takes requestedName and appends numbers(1, 2, 3...) until an available name is found
 */
public Account(String requestedName){

  String username = requestedName;
  int i = 0;
   while(!IsAvailable){
     i++;
     username = requestedName + i;
     
   }
}





