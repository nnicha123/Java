import java.util.*;
public class ArrayThree {
  public static void main(String[] z){
    String s = "I love you";
    char[] a = s.toCharArray();
    int i = 0;
    a[2] = 'h';
    a[3] = 'a';
    a[4] = 't';
    while(i<a.length){
      System.out.println(a[i]);
      i++;
    }
    String newStr = new String(a);
    System.out.println(newStr);
  }
}
