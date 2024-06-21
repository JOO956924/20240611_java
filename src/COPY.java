public class COPY {
  public static void main(String[] args) {
    Buyer b = new Buyer();
    Tv tv = new Tv();
    Laptop laptop = new Laptop();
    Audio audio = new Audio();

    b.buy(tv); b.buy(laptop); b.buy(audio);
    System.out.println(b.money);
  }
}


class Buyer {
  int money = 1000;

  void buy(Item item) {
    money -= item.price;
  }
}

abstract class Item {
  int price;
  public Item(int price){
    this.price = price;
  }
}

class Tv extends Item{
  public Tv () {
    super(500);
  }
}

class Laptop extends Item{
  public Laptop () {
    super(280);
  }
}

class Audio extends Item{
  public Audio () {
    super(200);
  }
}