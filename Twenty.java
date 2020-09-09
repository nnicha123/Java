import java.util.*;
public class Twenty {
  public static void main(String[] z){
    String str1 = "LOVE";
    String str2 = "HATE";
    char[] c1 = str1.toCharArray();
    char[] c2 = str2.toCharArray();
    char[] newStr = new char[8];
    int k=1; int count1=0; int count2=0;
    while(k<=8){
        if(k%2 != 0){
          newStr[k-1] = c1[count1];
          count1++;} 
        else{ 
          newStr[k-1] = c2[count2];
          count2++;}
      k++;
    }
    for(int n=0;n<newStr.length;n++){
      System.out.print(newStr[n]);
    }
  }
}
