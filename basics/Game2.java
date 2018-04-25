class Game2{
  public void play() throws CheckedException{
    String name = null;
    try {
      System.out.println(name.toString());
    }
    catch (Exception e) {
      throw new CheckedException(e);
    }
  }
  public static void main(String[] args)throws Exception{
    new Game2().play();
  }
}
