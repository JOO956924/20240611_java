package p05_Inherit;

import java.util.Objects;

public class Ex05Override {
  public static void main(String[] args) {
    Data d1 = new Data(1);
    Data d2 = new Data(1);
    System.out.println(d1);
    System.out.println(d2);
    if (d1.equals(d2)) {
      System.out.println("값이 같다");
    } else if (d1!=d2) {
      System.out.println("값이 다르다");
    }
  }
}

class Data {
  int value;

  public Data(int value) {
    this.value = value;

  }
  public String toString() {return "value:" + value;}

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Data) {
      Data d = (Data) obj;
      return value == d.value;
    }
    return false;
  }

  @Override
  public int hashCode() {
    //hashcode의 값이 동일할때
    return Objects.hash(value);
  }
}