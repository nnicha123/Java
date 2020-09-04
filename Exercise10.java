public class Exercise10 {
  public static void main(String[] z){
    int num = 463561, letterNum;
    String str = Integer.toString(num);
    for(int i=0;i<str.length();i++){
      letterNum = Character.getNumericValue(str.charAt(i));
      System.out.print(letterNum + ": ");
      for(int j=0;j<letterNum;j++){
        System.out.print('o');
      }
      System.out.println(' ');
    }
  }
}
