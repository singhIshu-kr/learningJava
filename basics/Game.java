class Game{
  public void play(){
    String name = null;
    try {
      name = "hie";
      int a[] = new int[2];
      // System.out.println(a[1]);
      // System.out.println(name.toString());
    }catch (NullPointerException e) {
      throw new NameException(e);
    }catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Size of array is not correct!");
    }finally{
      String x = null;
      System.out.println(x.toString());
      System.out.println("Program crashed");
    }
    name = "Neeraj";
    System.out.println(name);
  }
  public static void main(String[] args) {
    new Game().play();
  }
}
