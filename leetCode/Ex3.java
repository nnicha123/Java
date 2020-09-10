import java.util.*;
public class Ex3 {
  public static void main(String[] z){
    System.out.println(reverse(123));
    System.out.println(reverse(-123));
    System.out.println(reverse(1534236469));
    System.out.println(reverse(0));
  }
  public static int reverse(int x){
     boolean negative = false;
    if(x < 0) negative = true;
    String str = Integer.toString(Math.abs(x));
    String newStr = ""; char[] charArr = str.toCharArray();
    for(int i=charArr.length-1;i>=0;i--){
      newStr += charArr[i];
    }
    if(newStr.charAt(0) == '0' && charArr.length >1){ newStr = newStr.substring(1);}
    if(negative) newStr = '-' + newStr; 
    return Integer.valueOf(newStr);
  }
}
