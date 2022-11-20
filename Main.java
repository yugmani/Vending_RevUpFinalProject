import java.util.*;
import java.text.SimpleDateFormat;

class Main {
  public static void main(String[] args) {

    // Create three Soda objects;
    Soda coke = new Soda("Coke", 2, 100);
    Soda fanta = new Soda("Fanta", 2, 0);
    Soda sprite = new Soda("Sprite", 2, 10);

    // Create three snacks objects
    Snacks lays = new Snacks("Lays", 5, 15);
    Snacks cheetos = new Snacks("Cheetos", 5, 20);
    Snacks dorritos = new Snacks("Dorritos", 5, 15);

    // Creat a new ArrayList of food items;
    ArrayList<String> foods = new ArrayList<>();

    // Adding food items in the list;
    foods.add(coke.getName());
    foods.add(fanta.getName());
    foods.add(sprite.getName());
    foods.add(lays.getName());
    foods.add(cheetos.getName());
    foods.add(dorritos.getName());

    // Create a new customer ojbect;
    Customer client = new Customer();

    // Create Scanner Object
    Scanner sc = new Scanner(System.in);

    // list all food items;
    System.out.println();
    System.out.println("Welcome! Taste Our Healthy & Tasty Foods!!");
    for (int i = 1; i <= foods.size(); i++) {
      System.out.print(i + " - " + foods.get(i - 1) + "\t\t");
      if (i % 3 == 0) {
        System.out.print("\n");
      }
    }

    // // Vending machine screen display of items
    // System.out.println("1 - Coke\t4 - Lays" + "\n2 - Fanta\t5 - Dorritos" + "\n3
    // - Sprite\t6 - Cheetos" + "\n0 - Quit");

    boolean next = false;
    int item = 0;

    do {
      // Instruction to Customer
      System.out.println();
      System.out.println("Which Item do you want to buy? ( Enter 0 to quit! )");

      try {
        // Selection of food item
        item = sc.nextInt();

        // calculate balance based on the food selected and price
        if (item != 0 && item < foods.size()) {
          System.out.println("How many do you want?");
          int num = sc.nextInt();

          switch (item) {
            case 1:
              client.buyFood(coke, num);
              break;
            case 2:
              client.buyFood(fanta, num);
              break;
            case 3:
              client.buyFood(sprite, num);
              break;
            case 4:
              client.buyFood(lays, num);
              break;
            case 5:
              client.buyFood(dorritos, num);
              break;
            case 6:
              client.buyFood(cheetos, num);
              break;
            default:
              break;
          }

          System.out.println("Do you want to buy next item? Y/N");
          char c = sc.next().charAt(0);

          // If yes
          if (c == 'Y' || c == 'y') {
            next = true;
          } else { // otherwise
            next = false;
          }
        } else if (item == 0) {
          System.out.println("Thank you for visiting us! See you next time.");
        } else {
          System.out.println("***Invalid Entry!!***");
        }
      } catch (Exception e) {
        System.out.println("***Invalid Entry!!***");
      }

    } while (next == true); // do loop until customer wants next item

    // print out receipt
    if (item != 0 && item < foods.size()) {
      client.printInvoice();
      // formating current date/time and print
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      Date date = new Date();
      System.out.println("Transaction Date: " + formatter.format(date));
      System.out.println("Thank you for visiting us! See you next time.");
    }

    // closing Scanner object
    sc.close();
  }
}