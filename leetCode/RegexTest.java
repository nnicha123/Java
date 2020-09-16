import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexTest {
  public static void main(String[] z){
    Pattern pattern = Pattern.compile("abc",Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("abcra");
    boolean matchFound = matcher.find();
    if(matchFound){
      System.out.println("Match Found");
    } else {
      System.out.println("Match not Found");
    }
  }
}
