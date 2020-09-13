import java.util.*;
public class Ex11 {
  public static void main(String[] z){
    buddyStrings("ab","ba");
  }
  public static boolean buddyStrings(String A, String B){
    if(A.length() != B.length()) {return false;}
    if(A.equals(B)){return false;}
    char[] arr = A.toCharArray();
    char[] arr2 = B.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(arr2);
    for(int i=0;i<arr.length;i--){
      if(arr[i] != arr2[i]){return false;}
    }
    return true;
  }
}
