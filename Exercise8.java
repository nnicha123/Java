public class Exercise8 {
  public static void main(String[] z){
    int num = 65536214, sum = 0, individual = 0;
    String str = Integer.toString(num);
    for(int i=0;i<str.length();i++){
      individual = Character.getNumericValue(str.charAt(i));
      if(str.charAt(i) % 2 != 0) sum += individual;
    }
    System.out.println(sum);
  }
}
