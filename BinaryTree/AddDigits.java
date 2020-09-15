import java.util.*;
public class AddDigits {
  public static void main(String[] z){
    add(2268);
  }
  public static int add(int num){
    String str  = "" + num;
    if(str.length() == 1){return num;}
    else{
      char[] c = str.toCharArray();
       int total = 0;
      for(int i=0;i<c.length;i++){
        total += Character.getNumericValue(c[i]);
      }
      System.out.println(total);
      return add(total);
    }
   
  }
}
