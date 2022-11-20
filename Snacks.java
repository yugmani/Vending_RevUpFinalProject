public class Snacks extends Vending {

  // Constructor without parameters
  public Snacks() {

  }

  // parameterized constructor
  public Snacks(String name, int price, int stock) {
    super(name, price, stock);

  }

  @Override
  public String toString() {
    return "The " + getName() + " costs " + getPrice() + " and we have " + getStock() + " in stock.";
  }

}