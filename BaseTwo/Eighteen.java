public class Eighteen {
  public static void main(String[] z){
    System.out.println(convert(12));
    System.out.println(convert(75));
    System.out.println(toInt("1100"));
    System.out.println(toInt("11100"));
  }
  public static String convert(int num){
    return Integer.toBinaryString(num);
  }
  public static int toInt(String binary){
    return Integer.parseInt(binary,2);
  }
}
