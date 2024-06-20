package p05_Inherit;

public class Ex01hasa_isa {
  public static void main(String[] args) {
    Child child = new Child();
    System.out.println(child.familyName);
    Paraent paraent = new Paraent();
    System.out.println(paraent.familyName);
    Car car = new Car();
    System.out.println(car.engine);
    Engine engine = new Engine();
    System.out.println(engine);
  }
}

// has-a 관계 : car 와 engine 은 공통된 속성과 기능 공유하지 않는다
class Car {
  Engine engine = new Engine();
}

class Engine {
  int V;
}
// is-a 관계 : parent 와 child 는 공통된 속성을 공유한다
class Paraent {
  String familyName;
}

class Child extends Paraent {

}