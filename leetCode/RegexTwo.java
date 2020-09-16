import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexTwo {
  public static void main(String[] z)
  {
    Pattern pattern = Pattern.compile("[a-z]");
    
    String str = "abc wsg1 erg 3";
    String newStr = "";
    char[] c = str.toCharArray();
    for(int i=0;i<c.length;i++){
      Matcher matcher = pattern.matcher("c[i]");
      if(matcher.find()){
        newStr += c[i];
      }
    }
    System.out.println(newStr);
  }
}
