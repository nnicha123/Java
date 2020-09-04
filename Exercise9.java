public class Exercise9 {
  public static void main(String[] z){
    int num = 475291, count=1,sum=0;
    String str = Integer.toString(num);
    for(int i=str.length()-1;i>=0;i--){
      if(count %2 != 0){
        sum += Character.getNumericValue(str.charAt(i));
      }
      count++;
    }
    System.out.println(sum);
  }
}
