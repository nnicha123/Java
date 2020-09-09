import java.util.*;
public class Seventeen {
  public static void main(String[] z){
    System.out.println(reverseVowel("HELLO"));
    System.out.println(reverseVowel("DEMONSTRATION"));
  }
  public static String reverseVowel(String str){
    char[] c = str.toCharArray();
    int left=0; int right=c.length-1;
    while(left<=right){
      if((c[left] == 'A' || c[left] == 'E'|| c[left] == 'I' || c[left] == 'O' || c[left] == 'U') &&
      (c[right] == 'A' || c[right] == 'E'|| c[right] == 'I' || c[right] == 'O' || c[right] == 'U')){
        char tmp = c[left];
        c[left] = c[right];
        c[right] = tmp;
        left++;right--;
      } else {
        if(!(c[left] == 'A' || c[left] == 'E'|| c[left] == 'I' || c[left] == 'O' || c[left] == 'U')){
          left++;
        } 
        if(!(c[right] == 'A' || c[right] == 'E'|| c[right] == 'I' || c[right] == 'O' || c[right] == 'U')){
          right--;
        }
      }
    }
    String s=new String(c);
    return s;
  }
}
