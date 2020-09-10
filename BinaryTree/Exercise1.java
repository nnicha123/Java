import java.lang.*;
public class Exercise1 {
  public static void main(String[] z){
    System.out.println(countRound(10));
  }
  public static int countRound(int num){
    int count = 0; double numConv = num;
    System.out.println(num);
    while(numConv > 1){
      numConv = Math.round(numConv/2.0);
      System.out.println((int)numConv);
      count++;
    }  
    return count;
  }
}
