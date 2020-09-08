import java.util.*;
public class SequentialSearch {
  public static void main(String[] z){
    int[] area = {10500,10300,10330,10700,11000,11130,12000};
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Code: ");
    int code = in.nextInt();
    String result = "No";
    int i = 0;
    while(i<area.length){
      if(code == area[i]){ result = "Yes"; }
      i++;
    }
    System.out.println(result);
  }
}
