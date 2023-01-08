import java.util.Scanner;

public class Dealership {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("🚗 Welcome to the Java Dealership 🚗");

    System.out.println(" ‣ Select option 'a' to buy a car");
    System.out.println(" ‣ Select option 'b' to sell a car");
    String option = scanner.nextLine();

    switch (option) {
      case "a":
        System.out.println("You chose option " + option);
        break;
      case "b":
        System.out.println("You chose option " + option);
        break;
      default:
        System.out.println("This is a terrible use case for switch");
    }

    scanner.close();
  }
}
