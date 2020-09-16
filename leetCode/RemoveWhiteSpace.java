import java.util.*;
public class RemoveWhiteSpace {
  public static void main(String[] z){
    String str = "words and 987";
    str = str.trim();
    String newStr = "";
    boolean isNegative = false;

    if(str.charAt(0) == '-'){ isNegative = true; }

    int i = 1;
    while(i<str.length()){
      if(str.charAt(i) == ' '){break;}
      if(str.charAt(i) >= '0' && str.charAt(i) <=9){
      }
      newStr += str.charAt(i);
      i++;
    }
    return isNegative ? (int)('-' + newStr) : (int)newStr;
    System.out.println(newStr);
  }
}
