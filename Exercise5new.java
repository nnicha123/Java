public class Exercise5new {
  public static void main(String[] z){
    int num = 24;
    int count = 0;
    int remaining = count;
    while(num >= 0){
      count++;
      if(num < count) remaining = num;
      if(num >= count) remaining = count;
      for(int j=1;j<=remaining;j++){
        System.out.print('o');
      }
      num -= count;
      System.out.println(' ');
    }
  }
}
