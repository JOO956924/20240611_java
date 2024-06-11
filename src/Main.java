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

  public static void main(String[] args) {
    Main main = new Main();
    main.done();
  }
}
/*
클래스 선언할 경우
1) 멤버변수와 메서드 없어도 클래스 선언가능.
2) ★멤버변수와 메서드를 정의하려고 하면 반드시 클래스를 선언
3) class 앞에 public이 붙을 경우 반드시 파일명과 일치하는 클래스에 붙일것
   (파일명과 클래스이름이 같아야 퍼블릭(접근제어자) 부여가능).
4) 클래스를 사용하려면 인스턴스를로 만들어야 한다.
5) 클래스는 new(생성연산자)를 통해 인스턴스를 생성할 수 있다.
*/
class Animal {

}