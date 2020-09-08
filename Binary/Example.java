import java.util.*;
public class Example {
  public static void main(String[] x){
    int[] area = {10500,10300,10330,10700,11000,11130,12000};
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Code: ");
    int code = in.nextInt();
    String result = "No";
    Arrays.sort(area);
    int left = 0;
    int right = area.length -1;
    while(left <= right){
      int mid = (left + right)/2;
      if(code == area[mid]){
        result = "Yes";
        break;
      }
      if(code < area[mid]){ right =  mid-1;}
      if(code > area[mid]){ left =  mid+1;}
    }
    System.out.println(result);
  }
}
