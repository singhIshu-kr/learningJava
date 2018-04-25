class Sample{
  public static String prefix = "hellllllo";
  public Sample(String prefix){
    this.prefix = prefix;
  }
  public void greeter(String msg){
    System.out.println(this.prefix + msg);
  }
  public void changeGreet(String prefix){
    this.prefix = prefix;
  }
  public static   void main(String argv[]){
    Sample hi = new Sample("hey ");
    Sample hello = new Sample("hello ");
    hi.greeter("world");
    hello.changeGreet("hiiiiiiii");
    hello.greeter("world");
  }
}
