import java.util.ArrayList;

public class Mobile {
  private ArrayList<String> mobile = new ArrayList<String>();

  public void addNumber(String number) {
    mobile.add(number);
  }

  public void removeNumber(String number) {
    if (findItem(number) >= 0) {
      mobile.remove(findItem(number));
    }
    System.out.println("Successfully removed number: " + number);
  }

  public void updateNumber(String oldNumber, String newNumber) {
    if (findItem(oldNumber) >= 0) {
      updateNumber(findItem(oldNumber), newNumber);
    }
  }

  private void updateNumber(int position, String newNumber) {
    mobile.set(position, newNumber);
    System.out.println("Successfully modified");
  }

  public void findNumber(String number) {
    if (findItem(number) >= 0) {
      System.out.println("Found number!");
    } else {
      System.out.println("Number invalid");
    }
  }

  private int findItem(String item) {
    return mobile.indexOf(item);
  }

  public void printMobile() {
    System.out.println("Here are your current numbers: ");
    for (int i = 0; i < mobile.size(); i++) {
      System.out.println((i + 1) + " : " + mobile.get(i));
    }
  }
}
