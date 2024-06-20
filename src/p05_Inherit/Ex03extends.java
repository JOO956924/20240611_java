package p05_Inherit;

public class Ex03extends {
  public static void main(String[] args) {
    Marine m1 = new Marine();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);
  }
}

abstract class Unit {
  public Unit(String tribe, int hp) {
    super();
    this.tribe = tribe;
    this.hp = hp;
  }

  int hp;
  String tribe;

  public void move(int x, int y) {
  }

  public void stop() {
  }

  @Override
  public String toString() {
    return String.format("Unit{hp=%d, tribe=%s}",hp,tribe);
  }
}

abstract class Terren extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속 // 생성자는 상속안됨
  public Terren(int hp) {
    super("Terran",hp);
  }
}

class Marine extends Terren {
  public Marine() {
    super(60);
  }
}
class Medic extends Terren {
  public Medic() {
    super(45);
  }
}