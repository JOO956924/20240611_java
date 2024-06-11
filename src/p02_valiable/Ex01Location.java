package p02_valiable;

public class Ex01Location {
  //1. 변수의 선언 위치 :: 전역, 지역
  int sum = 0; //멤버변수는 전역(global variable)

  //int sum = 1;// 같은레벨에선 같은이름 중복선언 으로 사용불가
  public  void sum(){
    System.out.println("global:" + sum);
    int sum = 1;
    System.out.println("local:" + sum);
    //지역=중괄호 안에서 선언된 변수(local variable)
  }
public static void main(String[] args) {
    Ex01Location ex01Location = new Ex01Location();
  System.out.println(ex01Location.sum);
    ex01Location.sum();
  }
}
