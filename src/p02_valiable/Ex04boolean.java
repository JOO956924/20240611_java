package p02_valiable;

public class Ex04boolean {
  public static void main(String[] args) {
    Tv tv = new Tv();
    /*tv.power = true;*/
    System.out.println(tv.power);
    tv.power();
    tv.power();

  }

}

class Tv {
  boolean power;
  
  int ch = 0;

  int vl;

  void power() {
    /*1
    if (power == false) {
      power = true;
      System.out.println("Tv 전원이 켜졌습니다");
    } else {
      power = false;
      System.out.println("Tv 전원이 꺼졌습니다");
    }
    if (power == true) {
      System.out.println("Tv 전원이 켜졌습니다");
    } else {
      System.out.println("Tv 전원이 꺼졌습니다");
    }*/
    //3
    power = !power;
    System.out.println(power ? "전원 on" : "전원 off");
  }
  void channelUp() {
    System.out.println(ch++);
  }

  void channelDown() {
    System.out.println(ch--);
  }

}
