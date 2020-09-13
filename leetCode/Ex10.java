public class Ex10 {
  public static void main(String[] z){
    System.out.println(wordPattern("abba","dog cat cat dog"));
  }
  public static boolean wordPattern(String pattern, String s){
    String[] patternSplit= pattern.split("");
    String[] stringSplit = s.split(" ");
    for(int i=0;i<stringSplit.length;i++){
      System.out.println(stringSplit[i]);
    }
    return true;
  }
}
