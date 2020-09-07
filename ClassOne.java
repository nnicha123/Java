import java.io.*;
import java.util.*;

class ClassOne{
  public static void main(String[] z) throws Exception {
    File file = new File("data.txt");
    Scanner in = new Scanner(file);
    while(in.hasNextInt()){
      int num = in.nextInt();
      int count = num;
      String str = "";
      while(count > 0){
        str = str + 'o';
        count --;
      }
      System.out.println(num + ":" + str);
    }
  }
}