class Rectangle extends Shape{
  private final float lenght;
  private final float width;
  Rectangle(float lenght,float width){
    this.lenght = lenght;
    this.width = width;
  }
  public float area(){
    return this.lenght*this.width;
  }
  public float perimeter(){
    return 2*(this.lenght+this.width);
  }
}
