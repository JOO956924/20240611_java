package p02_valiable;

public class Ex04boolean {
  public static void main(String[] args) {
    Tv tv = new Tv();
    
    tv.power = true;
    System.out.println(tv.power);
    tv.power();
    tv.power();


    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelUp();
    tv.channelDown();
    tv.channelDown();
    tv.channelDown();
    tv.channelDown();

    System.out.println("=============================");
    tv.volumup();
    tv.volumup();
    tv.volumup();
    tv.volumdown();
    tv.volumdown();

  }

}

class Tv {
  boolean power;
  
  int ch ;

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
    if (power) {
      System.out.println(++ch);
    }
    /*ch++;
    ch = ch+1;
    ch += 1;*/
  }

  void channelDown() {
    if (power) {
      System.out.println(--ch);
    }
  }
  void ch(int ch) {
    this.ch = ch;
  }
  void volumup() {
    System.out.println(vl++);
  }
  void volumdown() {
    System.out.println(vl--);
  }
}
