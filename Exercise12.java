import java.lang.Math; 

public class Exercise12 {
  public static void main(String[] z){
    double num = 40;
    int square = 0;
    double sqrtNum = Math.sqrt(num);
    if(sqrtNum == (int)sqrtNum) square = (int)num;
    if(sqrtNum != (int)sqrtNum){
      if(num > 10) square = (int)Math.round(sqrtNum)*(int)Math.round(sqrtNum);
      if(num <= 10) square = (int)num*(int)num;
    }
    System.out.println("Positive Integer: " + (int)num);
    System.out.println("Perfect Square: " + square);
  }
}
