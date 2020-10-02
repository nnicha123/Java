import java.util.*;
public class Start {
  public static void main(String[] z){
    String str = "BOOMERANG";
    String str1 = "BoOMeERaNG";
    System.out.println(swapVowel(str));
    System.out.println(swapVowel(str1));
  }
  public static String swapVowel(String str){
    
    char[] c = str.toCharArray();
    int i=0; int j=c.length-1;
    while(i<j){
      if(isVowel(c[i]) && isVowel(c[j])){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        i++;j--;
      }
      else if(!isVowel(c[i]) && isVowel(c[j])) i++;
      else if(isVowel(c[i]) && !isVowel(c[j])) j--;
      else { i++;j--; }
    }
    String result = "";
    for(int k=0;k<c.length;k++) result += c[k];
    return result;
  }
  public static boolean isVowel(char c){
    c = Character.toUpperCase(c);
    return c=='A'|| c=='E' || c=='I' || c=='O' || c=='U';
  }
}
