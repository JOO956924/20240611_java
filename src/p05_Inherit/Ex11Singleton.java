package p05_Inherit;

public class Ex11Singleton {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println(s1);
    System.out.println(s2);
  }
}

class Singleton {
  private static Singleton singleton;
  private Singleton() { }
  static public Singleton getInstance() {
    if(singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}