package JavaTraining;

import java.util.Scanner;

// Create a static method in a class to display the number in reverse order.

// Test Data :
// Input a number: 12345
// Expected Output :
// The number in reverse order is : 54321

public class Task3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number to display in reverse order: ");

    int userInput = scanner.nextInt();

    reverseAndDisplay(userInput);

    scanner.close();
  }

  static void reverseAndDisplay(int userInput) {

    String numString = String.valueOf(userInput);
    String reverseString = "";

    for(int i = numString.length() - 1; i >= 0; i--) {
      reverseString = reverseString + numString.charAt(i);
    }

    int reversedNumber = Integer.parseInt(reverseString);

    System.out.printf("Reversed number of %d is %d: ", userInput, reversedNumber);

    // int reverseNumber = 0;

    // while(userInput > 0) {
    //   int digit = userInput % 10;
    //   System.out.println(digit);
    //   reverseNumber = reverseNumber * 10 + digit;
    //   System.out.println(reverseNumber);
    //   userInput = userInput / 10;
    //   System.out.println(userInput);
    // }
    
    // System.out.printf("The reversed string is: %d ", reverseNumber);
  }
  
}
