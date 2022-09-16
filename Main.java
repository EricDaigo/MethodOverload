
class Main {
  public static void main(String[] args) {
    System.out.printf("Quadrado dos int 7 é %d\n", square(7));
    System.out.printf("Quadrado dos double 7.5 é %f\n", square(7.5));
  }

  public static int square(int intValue){
    return intValue * intValue;
  }

  public static double square(double doubleValue){
    return doubleValue * doubleValue;
  }
}