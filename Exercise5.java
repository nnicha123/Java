public class Exercise5 {
  public static void main(String[] z){
    int num = 21;
    int count = 0;
    int remainingRounds = num;
    for(int i=0;i<=remainingRounds;i++){
      count++;     
      remainingRounds -= count;
      System.out.print(remainingRounds);
      for(int j=1;j<=count;j++){
        System.out.print('o');
      }
      System.out.println(' ');
    }
  }
}
