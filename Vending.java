public class Vending implements InOrder {
  //Define variables
  private String name;
  private int price;
  private int stock;

  //Constructor without parameters
  public Vending(){
    
  }

  //parameterized constructor
  public Vending(String name, int price, int stock){
    this.name = name;
    this.price = price;    
    this.stock = stock;
  }
 
  //getters
  public String getName(){
    return name;
  }

  public int getPrice(){
    return price;
  }

  public int getStock(){
    return stock;
  }

  //Setters
  public void setName(String soda){
    this.name = soda;
  }

  public void setPrice(int price){
    this.price = price;
  }

  public void setStock(int stock){
    this.stock = stock;
  }

  //@Overriding
  // method to check if there is enough item in stock.
  public Boolean isInOrder(int n) {
    return getStock() >= n;
  }

  @Override
  public String toString(){
    return "The "+ name + " costs " + price + " and we have " + stock + " in stock.";
  }
  
  
}