package StringMethods;

public class StrMethods {
  public static void main(String[] args) {
    
    String name = "Java Tutorial";

    int length = name.length();
    char letter = name.charAt(2);
    int firstOccurance = name.indexOf('a');
    int lastOccurance = name.lastIndexOf('a');

    // String uppercaseName = name.toUpperCase();
    // String lowercaseName = name.toLowerCase();

    System.out.println(length);
    System.out.println(letter);
    System.out.println(firstOccurance);
    System.out.println(lastOccurance);

    String spaceName = "   Java   ";

    System.out.println(spaceName.trim());
    System.out.println(name.isEmpty());
    System.out.println(name.contains("sd"));
    System.out.println(name.equals("as"));

    System.out.println(name.substring(2, 10)); // to extract portion of a string
    System.out.println(name.substring(2));

    String email = "java_123@gmail.com";

    System.out.println(email.substring(0,8));
    System.out.println(email.substring(0, email.indexOf("@")));














  }
}
