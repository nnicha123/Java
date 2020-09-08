import java.util.*;
public class Thirteen {
  public static void main(String[] z){
    System.out.println(check("()"));
    System.out.println(check(")("));
    System.out.println(check("(()"));
    System.out.println(check("()(())"));
  }
  public static boolean check(String str){
    char[] c = str.toCharArray();
    int left = 0; int right = 1;
    while(right < c.length){
      if(c[left] == '('){
        if(c[right] == ')'){left = right+1; right++;}
        else{right++;}
      }
    }
    return true;
  }
}
