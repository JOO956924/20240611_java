package p01_class;


public class AnimalEx {
  static Animal a2 = new Animal();
  // Q) Animal을 인스턴스로 만들어 사용해 보시오
  // 메인메서드가 아닌 메서드는 메인메서드에 인스턴스로 불러졌을때 실행가능
  public void done() {
  Animal a1 = new Animal();
    a1.run();
  }

  //메인 메서드는 JVM으로 실행됨
  //메인 메서드는 static 요소(확실하게 정의됨)가 있어야 실행되기전에 메서드 에리어로 호출되며 JVM으로 실행됨
  //메인 메서드는 인스턴스가 없어도 실행가능?
  //메인 메서드가 아닌 메서드의 변수가 메인 메서드에서 실행되려면 static 요소를 붙여야함
  public static void main (String[] args) {
    Animal a1 = new Animal();

    a1.run();
    AnimalEx animalEx = new AnimalEx();
    animalEx.done();
    System.out.println(animalEx.a2);
    //static 은 static 끼리만 사용 :시점이 다름
    a2.run();
  }
}