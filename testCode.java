import java.util.*;
public class testCode {
  public static void main(String[] z){
    String val = "BOOMERANG";
    char[] c = val.toCharArray();
    int i = 0; int j = c.length-1;

    while(i<j){
          if(i >= j){break;}
          if((c[i] == 'A'||c[i] == 'E'||c[i] == 'I'||c[i] == 'O'||c[i] == 'U')&& (c[j] == 'A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U')){
                  char temp = c[i];
                  c[i] = c[j];
                  c[j] = temp;
                  i++; j--;
          }
          if(i >= j){break;}
          if(!(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]== 'O'||c[i]=='U')&& (c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U')){
                  i++;
          }
          if(i >= j){break;}
          if((c[i]=='A'||c[i]== 'E'||c[i]=='I'||c[i]=='O'||c[i]=='U')&& !(c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U')){
                  j--;
          }
          if(i >= j){break;}
          if(!((c[i]== 'A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')&& (c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U'))){
                  i++;j--;
          }
  }
  String result = "";
  for(int k=0;k<c.length;k++)result+= c[k];
  System.out.println(result);
  }
}
