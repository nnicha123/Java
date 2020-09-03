public class Exercise4 {
  public static void main(String[] z){
    int layers = 8;
    int count = 0;
    for(int i=1;i<=layers;i++){
      for(int j=1;j<=i;j++){
        System.out.print('o');
        count += 1;
      }
      System.out.println(' ');
    }
    System.out.println(count);
  }
}
