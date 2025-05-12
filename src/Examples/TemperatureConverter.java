package Examples;
import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {

    double temp;
    String unit;
    double convertedTemp;
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the temperature : ");
    temp = scanner.nextDouble();

    System.out.print("Enter the desired conversion (C or F) : ");
    unit = scanner.next().toUpperCase();

    if(unit.equals("C")) {
      convertedTemp = (temp - 32) * 5/9;;
      System.out.println("The new temp is " + convertedTemp + "F");
    } else {
      convertedTemp = (temp * 9/5) + 32;
      System.out.println("The new temp is " + convertedTemp + "C");
    }

    scanner.close();
  }  
}
