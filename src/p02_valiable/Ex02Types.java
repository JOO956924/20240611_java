package p02_valiable;

import p01_class.Animal;

public class Ex02Types {
  boolean power;
  char c1;
  byte b1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;
  String str;
  Animal a1;
  public static void main(String[] args) {
    // 변수의 종류 : Primitive(일반변수), Reference(참조형 변수)
    // Primitive type (일반 변수) : 실제값을 가지는 변수
    /*boolean power = true; // 논리형 (ture,false) 1byte
    char c1 = 'A'; // 문자형(한글자만가능), 2byte, 0~65535
    byte b1 = 10; // 정수형, 1byte, -128~127
    short s1 = 10; // 정수형, 2byte, -32768~32767
    int i1 = 10; // 정수형, 4byte, -2147483648~2147483647
    long l1 = 10L; // 정수형, 8byte
    float f1 = 0.1F; // 실수형, 4byte, 소수점 7째자리까지 10^-45~10^38
    double d1 = 0.1D; // 실수형, 8byte, 소수점 13째자리까지 10^-324~10^308*/

    // Reference type(참조형 변수) : 주소값을 가지는 변수
    String str = "Hello";
    System.out.println(str);
    Animal animal = new Animal();
    System.out.println(animal);
    Ex02Types ex02types = new Ex02Types();
    System.out.println(ex02types.power);
    System.out.println(ex02types.c1);
    System.out.println(ex02types.b1);
    System.out.println(ex02types.s1);
    System.out.println(ex02types.i1);
    System.out.println(ex02types.l1);
    System.out.println(ex02types.f1);
    System.out.println(ex02types.d1);
    System.out.println(ex02types.str);
    System.out.println(ex02types.a1);
  //멤버 변수를 출력할때는 기본값이 출력
  }
}
