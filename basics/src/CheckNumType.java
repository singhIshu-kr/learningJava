class Number{
  public int number;
  public Number(int number){
    this.number = number;
  }

  public boolean isGreaterThan(int secNum){
    return this.number > secNum;
  }

  public boolean isDivisibleBy(int divisor){
    return this.number % divisor == 0;
  }

  public boolean isEqualToSquareOf(int secNum){
    return secNum * secNum == this.number;
  }

  public boolean isEven(){
    return number % 2 == 0;
  }

  public boolean isOdd(){
    return !isEven();
  }

  public boolean isPrime(){
    int index = 2;
    while(isGreaterThan(index)){
      if (isDivisibleBy(index)) {
        return false;
      }
      index ++;
    }
    return true;
  }

  public boolean isSquare(){
    int index = this.number >> 1;
    while(index > 1){
      if (isEqualToSquareOf(index)) {
        return true;
      }
      index --;
    }
    return false;
  }

  public static void main(String[] args) {
    Number number = new Number(12);
    System.out.println(number.isEven());
    System.out.println(number.isOdd());
    System.out.println(number.isPrime());
    System.out.println(number.isSquare());
  }
}
