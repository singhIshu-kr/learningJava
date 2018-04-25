import java.util.Scanner;

class PrintInput{
  public void readInput(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = scan.next();
    System.out.println("Enter your age");
    int age = scan.nextInt();
    System.out.println("Welcome "+name+" your age is "+age);
  }
  public static void main(String[] args) {
    PrintInput printInput = new PrintInput();
    printInput.readInput();
  }
}
