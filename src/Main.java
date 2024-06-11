// class
public class Main {
  // 멤버 변수
  int num1 = 10;
  int num2 = 30;
  int num3 = num1 + num2;

  // 클래스없이 멤버변수 x
  void done() {
    System.out.println(num3);
    if (num1 < num2) {
      num3 = num1;
    } else {
      num3 = num2;
    }
  }
}


