package p05_Inherit;

public class Ex03extends {
  public static void main(String[] args) {
    Marine m1 = new Marine();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);
  }
}
// 추상(abstract)클래스는 스스로 인스턴스 생성 불가
// 상속받은 후 인스턴스 생성
abstract class Unit {
  public Unit(String tribe, String name, int hp) {
    super();
    this.tribe = tribe;
    this.name = name;
    this.hp = hp;
  }


  String tribe;
  String name;
  int hp;

  public void move(int x, int y) {
  }

  public void stop() {
  }

  @Override
  public String toString() {
    return String.format("%s{hp=%d,tribe=%s}", name, hp, tribe);
  }
}

abstract class Protoss extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속 // 생성자는 상속안됨
  public Protoss(String name, int hp) {
    super("Protoss", name, hp);
  }
}

abstract class Terren extends Unit {
  public Terren(String name, int hp) {
    super("Terran", name, hp);
  }
}

class Marine extends Terren {
  public Marine() {
    super("Marine", 60);
  }
}

class Medic extends Terren {
  public Medic() {
    super("Medic", 45);
  }
}