import p01_class.Animal;// class
import p01_class.AnimalEx;

public class Main {
  /*JVM(가상프로그램)*/
// 값이 없으면 자동으로 int=0이 할당됨
  public static void main(String[] args) {
    /*Main main = new Main();
    main.done();*/
    Animal animal = new Animal();
    animal.legs = 2;
    Animal animal2 = new Animal();
    animal2.legs = 4;
    System.out.println(animal.legs);
    System.out.println(animal2.legs);
    /*클래스
        멤버변수
          기본형
          참조형
  리턴타입 메소드 (매개 변수)
          변수
     */
    //인스턴스 = 복제본//
    //
  }
}

