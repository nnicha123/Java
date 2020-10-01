import java.util.*;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static Mobile mobile = new Mobile();

  public static void main(String[] z) {
    boolean quit = false;
    int choice = 0;
    while (!quit) {
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          mobile.printMobile();
          break;
        case 2:
          addNumber();
          break;
        case 3:
          modifyNumber();
          break;
        case 4:
          removeNumber();
          break;
        case 5:
          findNumber();
          break;
        case 6:
          quit = true;
          break;
      }
    }
  }

  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of numbers.");
    System.out.println("\t 2 - To add an number to the mobile");
    System.out.println("\t 3 - To modify an number in the mobile");
    System.out.println("\t 4 - To remove an number from the mobile");
    System.out.println("\t 5 - To search for an number in the mobile");
    System.out.println("\t 6 - To quit the application");
  }

  public static void addNumber() {
    System.out.println("Enter number you want to add: ");
    String number = scanner.nextLine();
    mobile.addNumber(number);
  }

  public static void modifyNumber() {
    System.out.println("Enter number you want to update: ");
    String oldNumber = scanner.nextLine();
    System.out.println("Enter update: ");
    String updateNumber = scanner.nextLine();
    mobile.updateNumber(oldNumber, updateNumber);
  }

  public static void removeNumber() {
    System.out.println("Enter number you want to remove: ");
    String remNumber = scanner.nextLine();
    mobile.removeNumber(remNumber);
  }

  public static void findNumber() {
    System.out.println("Enter number you want to find");
    String number = scanner.nextLine();
    mobile.findNumber(number);
  }

}
