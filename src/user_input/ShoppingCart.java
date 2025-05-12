package user_input;

import java.util.Scanner;

public class ShoppingCart {
  public static void main(String[] args) {
    
    String itemName;
    double cost;
    int quantity; 
    double total;

    Scanner scanner = new Scanner(System.in);

    System.out.println("What item you want to buy: ");
    itemName = scanner.nextLine();
    System.out.println("Cost of each item: ");
    cost = scanner.nextDouble();
    System.out.println("How many Qty: ");
    quantity = scanner.nextInt();

    total = cost * quantity;
    scanner.close();

    System.out.println("You have bought " + quantity + " " + itemName + "/s");
    System.out.println("Your total is: " + total);
  }
  
}
