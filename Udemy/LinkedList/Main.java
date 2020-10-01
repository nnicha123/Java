import java.util.*;

public class Main {
  public static void main(String[] z) {
    Customer customer = new Customer("Tim", 54.96);
    Customer anotherCustomer = customer;
    anotherCustomer.setBalance(19);
    System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
    System.out
        .println("Balance for second customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());

    ArrayList<Integer> intList = new ArrayList<Integer>();
    intList.add(1);
    intList.add(3);
    intList.add(4);
    for (int i = 0; i < intList.size(); i++) {
      System.out.println(i + ": " + intList.get(i));
    }
    intList.add(1, 2);
    System.out.println("---- New List ---");
    for (int i = 0; i < intList.size(); i++) {
      System.out.println(i + ": " + intList.get(i));
    }
    System.out.println(intList);
  }
}
