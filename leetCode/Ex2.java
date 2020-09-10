import java.util.*;
public class Ex2 {
  public static void main(String[] z){
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(-121));
    System.out.println(isPalindrome(10));
  }
  public static boolean isPalindrome(int x){
    String str = Integer.toString(x);
    char[] arr = str.toCharArray();
    int left=0;int right=arr.length-1;
    while(left<=right){
      if(!(arr[left] == arr[right])){ return false; }
      left++;right--;
    }
    return true;
  }
}
