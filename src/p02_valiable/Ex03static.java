package p02_valiable;

public class Ex03static {
  //static은 main()가 실행되기전 jvm이 메서드에리어에 로드됨.
  {
    System.out.println("인스턴스가 실행됩니다.");
  }
  static {
    System.out.println("한번만 실행됩니다");
  }
  static int vs ;
  int vi;

  public void foo() {
    System.out.println(vi + vs);
  }

  public static void tiger() {

    System.out.println(vs);
    //System.out.println(vi);
  }

  public static void main(String[] args) {
    // 초기화되는 시점이 다르다
    // static = 공통된값을 가진다
    // 인스턴스 = 각각의 값을 가진다

    Ex03static e1 = new Ex03static();
    Ex03static e2 = new Ex03static();
    e1.vi = 10;
    System.out.println(e1.vi);
    e2.vi = 20;
    System.out.println(e1.vi);
    e1.vs = 100;
    System.out.println(e1.vs);
    e2.vs = 200;
    System.out.println(e1.vs);
  }
}