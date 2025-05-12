package user_input;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Calculate area of rectangle

    double width = 0;
    double height = 0;
    double area = 0;

    Scanner myScanner = new Scanner(System.in);

    System.out.print("Enter width: ");
    width = myScanner.nextDouble();
    
    System.out.print("Enter height: ");
    height = myScanner.nextDouble();

    area = width * height;
    
    System.out.print("Area of Rectangle: " + area);

    myScanner.close();
  }  
}
