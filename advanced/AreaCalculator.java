
class AreaCalculator{
  public static void printArea(Shape shape){
    System.out.println(shape.area());
  }
  public static void printPerimeter(Rectangle rect){
    System.out.println(rect.perimeter());
  }
  public static void main(String[] args){
      printArea(new Rectangle(2,10));
      printArea(new Square(2));
      printPerimeter(new Rectangle(2,5));
      printPerimeter(new Square(6));
  }
}
