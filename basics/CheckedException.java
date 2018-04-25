class CheckedException extends Exception{
  CheckedException(Exception e){
    super("Name cannot be empty!",e);
  }
}
