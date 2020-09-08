import java.util.HashMap;

public class HashMapTest {
  public static void characterCount(String inputString){
    HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>(); 
    char[] strToArray = inputString.toCharArray();
    for(char c : strToArray){
      if(!charCountMap.containsKey(c)){
        charCountMap.put(c,1);
      }
    } 
    System.out.println(inputString+" : "+charCountMap);
  }
  public static void main(String[] z){
    String str = "ATGTTGT";
    characterCount(str);
  }
}
