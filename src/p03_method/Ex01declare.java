package p03_method;

import common.Utils;
import p02_valiable.Ex01Location;

public class Ex01declare {
  boolean b1;
  // return type (10 가지) : void : return 이 없는 경우,(primitive(8가지), reference) : return 있는경우
  void print1() {
    System.out.println("Hello method~!");
    return; // 보통은 return 을 표기 하지 않음
  }
  boolean print2 () {
    /*boolean result;
    Ex01declare ex01declare = new Ex01declare();
    result = ex01declare.b1;
    return result;*/
    return new Ex01declare().b1; // false를 리턴
  }
  char print3 () {
    return 'C';
  }
  int print4 () { return 10; }
  int print6 () { return (int) 0.0; }
  double print5 () {
    System.out.println("print5");
    return 10; // retrun 이후의
  }

  //오버로딩
  //이름이같다,리턴타입 x,매개변수의 타입과순서가 달라야한다.
  boolean print() {
    boolean result = false;
    return result;
  }


  boolean print (boolean result) {
    return result;
  }

  char print(char c) {return c;}

  int print(int i) {return i;}

  double print(double d) {return d ;}

  public static void main(String[] args) {
    Ex01declare e1 = new Ex01declare();
    //Ex01declare
    e1.print1();e1.print2();
    System.out.println(e1.print2());
    System.out.println(e1.print(true));
    System.out.println(e1.print('Z'));
    System.out.println(e1.print(-9.10));
    System.out.println(e1.print(-0.1));
    Utils.typeOf(10/3);
    System.out.println(MyMath.add(10,3));
    System.out.println(MyMath.subtract(3,10));
    System.out.println(MyMath.multiply(10,3));
    System.out.println(MyMath.divied(10,3));
    System.out.println(MyMath.share(10,3));
    System.out.println(MyMath.remain(10,3));
    System.out.println(Math.max(1,3));
    MyMath.shareRemain(10,3);


  }

}

class MyMath {
  // 메서드가 가지는 성격
  // 1) 객체의 속성(상태)를 처리하는 기능
  // 2) 객체의 속성(상태)를 온전(보호) 하게 하는 기능

  static double add(int n1, int n2) {
    //return  (double) (n1+n2);
    return  n1 + n2 + 0.0;
  }

  static int subtract(int n1, int n2) {
    return (n1 - n2);
  }

  static int multiply(int n1, int n2) {
    return (n1 * n2);
  }

  static double divied(int n1, int n2) {
    // double result = (double) (n1/n2);
    double result = n1/(double)n2;
    return result;
  }
  public static int share (int n1, int n2) {
    return n1/n2;



  }
  public static int remain (int n1, int n2) {
    return n1%n2;
  }
  public static void shareRemain(int n1, int n2) {

    //System.out.println("몫:" + share(n1,n2)+"나머지:" + remain(n1,n2));
    System.out.printf("몫: %d 나머지: %d",share(n1,n2),remain(n1,n2));
    System.out.println();
    System.out.println(String.format("몫: %d 나머지: %d",share(n1,n2),remain(n1,n2)));

  }
}
