package JavaTraining;

import java.util.Scanner;

// Create a static method in a class which accepts month (number like 1,2,3,...12) and prints season based on the month.
// For example, prints 'Winter' if month is 12,1 or 2.
// prints  'Spring' if month is 3,4 or 5,
// prints 'Summer' if month is 6,7,8
// prints 'fall' if months is 9,10,11
// prints 'not a valid month' if other than 1 to 12

public class Task1 {

  public static void main(String[] args) {

    int month;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the month: ");

    month = scanner.nextInt();

    if (month >= 1 && month <= 12) {
      season(month);
    } else {
      System.out.println("Not a valid month");
    }

    scanner.close();
  }

  static void season(int month) {
    switch (month) {
      case 1, 2, 12:
        System.out.println("Winter"); break;
      case 3, 4, 5:
        System.out.println("Spring");
        break;
      case 6, 7, 8:
        System.out.println("Summer");
        break;
      case 9, 10, 11:
        System.out.println("Fall");
        break;
      default:
        System.out.println("Not a valid month");
    }
  }

}
