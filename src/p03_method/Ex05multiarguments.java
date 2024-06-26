package p03_method;

public class Ex05multiarguments {
  // 메서드의 가변 인자
  public static void main(String[] args) {
    Multiarguments ma = new Multiarguments();
    ma.add(1,2,3);
    ma.add(new long[]{1,2,3,4});
    ma.add(1,2,3,4,5,6,7,8,9);
    ma.add(new Data(), new Data(), new Data(), new Data());
  }
}

class Multiarguments {
  public void add(int n1) {
    System.out.println("one");
  }
  public void add(int n1, int n2) {
    System.out.println("two");
  }
  public void add(int n1, int n2, int n3) {
    System.out.println("three");
  }
  public void add(long[] n) {
    System.out.println("array");
  }
  public void add(int n1, int...n) {
    System.out.println("...");
  }
  public void add(Data... data) {

  }

}
