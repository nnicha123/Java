import java.util.*;
public class Fourteen {
  public static void main(String[] z){
    System.out.println(check("MAHOGANY","HOGMANAY"));
    System.out.println(check("MORE","ROME"));
    System.out.println(check("MORE","HOME"));
  }
  public static boolean check(String one, String two){
    char[] arrOne = one.toCharArray();
    char[] arrTwo = two.toCharArray();
    Arrays.sort(arrOne); Arrays.sort(arrTwo);
    for(int i=0;i<arrOne.length;i++){
      if(arrOne[i] != arrTwo[i]){
        return false;
      }
    }
    return true;
  }
}
