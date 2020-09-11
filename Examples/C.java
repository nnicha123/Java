public class C {
  public static void main(String[] z){
    int[] arr = {6,9,8,12,25,4}; int sum = 0;
    for(int i=0;i<arr.length;i++)sum += perfectSquare(arr[i]);
    System.out.println(sum);
  }
  public static int perfectSquare(int num){
    int sqrtNum = (int)Math.sqrt(num);
    if(sqrtNum*sqrtNum == num) return sqrtNum;
    return 0;
  }
}
