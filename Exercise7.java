public class Exercise7 {
  public static void main(String[] z){
    int maxValue = 0;
    int value = 75251;
    String str = Integer.toString(value);
    while(str.length() >= 0){
      if(Integer.parseInt(str.substring(0,1)) > maxValue) maxValue = Integer.parseInt(str.substring(0,1));
      if(str.length() > 1) str = str.substring(1,str.length());
      else break;
    }
    System.out.println(maxValue);
  }
}
