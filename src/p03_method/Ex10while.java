package p03_method;

public class Ex10while {
  public static void main(String[] args) {
    /*int i = 0;
    int sum = 0;*/
    int i = 1;
    int sum = 2;
    while (i < 10) {
      sum = 2 ;

      while (sum < 10) {
        System.out.printf("%d * %d = %2d\t", sum, i, sum * i);
        sum++;
      }
      System.out.println();
      i++;

    }
  }
}
