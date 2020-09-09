import java.util.*;
public class Twelve {
  public static void main(String[] z){
    System.out.println(reduce("EENWSS"));
    System.out.println(reduce("EENWSSSWNN"));
  }
  public static String reduce(String str){
    int x = 0; int y=0; String newStr = "";
    char[] c = str.toCharArray();
    for(int i=0;i<c.length;i++){
      if(c[i] == 'N'){ y++; }
      if(c[i] == 'S'){ y--; }
      if(c[i] == 'E'){ x++; }
      if(c[i] == 'W'){ x--; }
    }
    while(y > 0){newStr+= 'N';y--;}
    while(y < 0){newStr+='S';y++;}
    while(x > 0){newStr+= 'E';x--;}
    while(x < 0){newStr+='W';x++;}

    return newStr;
  }
}
