import java.util.*;
public class Nine {
  public static void main(String[] z){
    System.out.println(check("RACECAR"));
    System.out.println(check("AHEADEA"));
  }
  public static boolean check(String str){
    char[] c = str.toCharArray();
    int left = 0; int right = c.length-1;
    while(left <= right){
      if(c[left] == c[right]){
        left++;right--;
      } else{
        return false;
      } 
    }
    return true;
  }
}