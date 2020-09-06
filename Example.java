import java.io.File;
import java.util.Scanner;
public class Example {
  public static void main(String[] z)throws Exception{
    File file = new File("area.txt");
    Scanner in = new Scanner(file);
    int count = 0;
    String country = "Mexico";
    System.out.println("Enter Country: " + country);
    while(in.hasNextLine()){
      String s = in.nextLine();
      if(s.equals(country)){
        count++;
      }
    }
    if(count >= 1) System.out.println("Available");
    else System.out.println("Not Available");
  }
}
