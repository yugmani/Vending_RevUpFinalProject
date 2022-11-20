public class Soda extends Vending {
  // Define variables

  // Constructor without parameters
  public Soda() {

  }

  // parameterized constructor
  public Soda(String name, int price, int stock) {
    super(name, price, stock);

  }  

  @Override
  public String toString() {
    return "The " + getName() + " costs " + getPrice() + " and we have " + getStock() + " in stock.";
  }

}