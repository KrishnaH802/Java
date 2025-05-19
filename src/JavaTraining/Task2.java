package JavaTraining;

import java.util.Scanner;

// Create a static method in a class which display n terms of natural numbers and their sum.
// For example, if we pass '7' to that method output should be like this,
// The first 7 natural number are : 1 2 3 4 5 6 7 and                                                               
// The Sum of Natural Number upto 7 terms : 28

public class Task2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a natural number: ");

    int naturalNumber = scanner.nextInt();

    displayNaturalNumberAndSum(naturalNumber);

    scanner.close();
  }

  static void displayNaturalNumberAndSum(int naturalNumber) {
    int sum = 0;

    System.out.printf("The first %d natural numbers are: ", naturalNumber );
    for (int i = 1; i <= naturalNumber; i++) {
      System.out.print(i + " ");
      sum = sum + i;
    }

    System.out.println();
    System.out.printf("The Sum of Natural Number upto %d terms : %d", naturalNumber, sum);
  }

}
