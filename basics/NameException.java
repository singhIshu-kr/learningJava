class NameException extends RuntimeException{
  NameException(Exception e){
    super("Name cannot be empty!",e);
  }
}
