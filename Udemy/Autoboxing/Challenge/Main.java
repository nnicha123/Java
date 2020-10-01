import java.util.*;

public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank("National Australia Bank");
    bank.addBranch("Adelaide");
    bank.addCustomer("Adelaide", "Tim", 50.05);
    bank.addCustomer("Adelaide", "Mike", 175.34);
    bank.addCustomer("Adelaide", "Percy", 220.12);

    bank.addBranch("Sydney");
    bank.addCustomer("Sydney", "Bob", 150.54);

    bank.addCustomerTransaction("Adelaide", "Tim", 10);
    bank.addCustomerTransaction("Adelaide", "Tim", 5.34);
    bank.addCustomerTransaction("Adelaide", "Mike", 20.12);

    bank.listCustomers("Adelaide", true);
  }
}