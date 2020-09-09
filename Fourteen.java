import java.util.*;
public class Fourteen {
  public static void main(String[] z){
    System.out.println(check("{}"));
    System.out.println(check("[{}]"));
    System.out.println(check("[({})]"));
    System.out.println(check("[({}])"));
    System.out.println(check("[{]}"));
  }
  public static boolean check(String str){
    char[] c = str.toCharArray();
    int left=0; int right=c.length-1;
    while(left<=right){
      if(!((c[left] == '{' && c[right] == '}') || (c[left] == '(' && c[right] == ')')
        || (c[left] == '[' && c[right] == ']'))){
          return false;
        }
      left++;right--;
    }
    return true;
  }
}
