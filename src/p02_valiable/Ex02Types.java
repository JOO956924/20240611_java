package p02_valiable;

import p01_class.Animal;

public class Ex02Types {
  // 변수의 종류 : Primitive(일반변수), Reference(참조형 변수)
  // Primitive type (일반 변수) : 실제값을 가지는 변수
  //변수의 할당 = 선언 + 초기화
  // 멤버변수는 선언만 해도 new(생성연산자) 를통해 기본값으로 초기화 된다.
  // 멤버변수가 할당이 된것은 new에서 제외
  boolean power = true;
  char c1;
  byte b1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;
  String str;
  Animal a1;

  // static 전에 초기화를 해야한다 한다

  public static void main(String[] args) {


    //지역변수는 사용하기위해서는 반드시 할당을 해야함
    boolean power = false; // 논리형 (ture,false) 1byte
    char c1 = 'A'; // 문자형(한글자만가능), 2byte, 0~65535
    byte b1 = 10; // 정수형, 1byte, -128~127
    short s1 = 10; // 정수형, 2byte, -32768~32767
    int i1 = 10; // 정수형, 4byte, -2147483648~2147483647
    long l1 = 10L; // 정수형, 8byte
    float f1 = 0.1F; // 실수형, 4byte, 소수점 7째자리까지 10^-45~10^38
    double d1 = 0.1D; // 실수형, 8byte, 소수점 13째자리까지 10^-324~10^308

    // Reference type(참조형 변수) : 주소값을 가지는 변수
    String str = "Hello";
    System.out.println(str);
    Animal animal = new Animal();
    System.out.println(animal);
    System.out.println(c1);
    System.out.println(str);
    System.out.println(power);
    System.out.println("=========================================");
    //전역변수를 사용하기 위해서는 인스턴스를 만들어야 한다.
    Ex02Types ex02types = new Ex02Types();
    System.out.println(ex02types.power); // false
    System.out.println(ex02types.c1);    // 공백
    System.out.println(ex02types.b1);    // 0
    System.out.println(ex02types.s1);    // 0
    System.out.println(ex02types.i1);    // 0
    System.out.println(ex02types.l1);    // 0
    System.out.println(ex02types.f1);    // 0.0
    System.out.println(ex02types.d1);    // 0.0
    System.out.println(ex02types.str);   // null
    System.out.println(ex02types.a1);    // null
  //값이 없는 멤버 변수를 출력할때는 기본값이 출력
  /*
      --할당
      type 변수명 ; --> 선언
      type : 값 ; --> 초기화

   */
  int total ;
    //System.out.println(sum); 선언 o , 초기화 x
    System.out.println();
  }
}





