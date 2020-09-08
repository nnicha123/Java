import java.util.*;
public class ArrayFour {
  public static void main(String[] z){
    String str = "ATGTTGT";
    char[] a = str.toCharArray();
    
    Arrays.sort(a);
    for(int i=0;i<a.length-1;i++){
      System.out.print(a[i]);
      System.out.println();
    }
  }

}
