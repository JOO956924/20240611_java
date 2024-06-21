package p05_Inherit;

public class Ex04CastingReason {
  public static void main(String[] args) {
    Buyer b1 = new Buyer();
    Laptop l1 = new Laptop();
    Tv tv = new Tv();
    Audio a1 = new Audio();

    b1.buy(tv); b1.buy(l1); b1.buy(a1);
    System.out.println(b1.money);

  }
}

class Buyer {
  int money = 1000;

  /*void buy(Tv tv) {money -= tv.price;}
  void buy(Laptop l1) {money -= l1.price;}
  void buy(Audio a1) {money -= a1.price;}*/
  void buy(Product product) {
    money -= product.price;
  }
}

abstract class Product {
  int price;
  public Product(int price){
    this.price = price;
  }

}

class Laptop extends Product{
  public Laptop() {
    super(280);
  }
}

class Tv extends Product{
  public Tv() {
    super(500);
  }
}

class Audio extends Product{
  public Audio() {
    super(200);
  }
}