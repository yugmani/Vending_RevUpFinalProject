import java.util.*;

public class Customer implements BuyItems {
  //define a variable for list of type Vending
  private List<Vending> foodItems;

  // default constructor
  public Customer() {
    //create arraylist of type Vending
    foodItems = new ArrayList<Vending>();
  } 

  // create a list of items that customer wants to buy
  public void buyFood(Vending s, int num) {
    // add in the list if it is not out of order
    if (s.isInOrder(num)) {
      for (int i = 0; i < num; i++) {
        foodItems.add(s);
      }
    } else { //if the item is out of order or short.
      System.out.println("Sorry, we don't have that much " + s.getName() + "!");        
    } 

  }

  // calculate total amount to pay
  public void printInvoice() {
    System.out.println();
    System.out.println("Yug's Vending Machine");
    System.out.println("********************");

    //initialize variable to calcuate total price for the items chosen.
    int total = 0;

    //looping through the list of items to calculate the total price.
    for (Vending vd : foodItems) {
      total += vd.getPrice();
    }

    System.out.println("Balance: $" + total);
    System.out.println("--------------------------------");

    //Scanner object to get user input
    Scanner input = new Scanner(System.in);

    System.out.print("Payment Amount : $");
    int amount = input.nextInt();
    
    int change = 0;

    //calculate the change to return back
    if (amount >= total) {
      change = amount - total;
      System.out.println("Change returned: $" + change);
      total = amount - (total + change);
    } else {
      System.out.println("Your amount is not enough!");
    }

    //print out final balance
    System.out.println("Final Balance : $" + total);
    System.out.println("--------------------------------");
    input.close();
  }

}