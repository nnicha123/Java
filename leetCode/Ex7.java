public class Ex7 {
  public static void main(String[] z){
    int[] arr = {9,9,9,9};
    int[] newArr = plusOne(arr);
    for(int i=0;i<newArr.length;i++){
      System.out.println(newArr[i]);
    }
  }
  public static int[] plusOne(int[] digits){
    String str = "";
    for(int i=0;i<digits.length;i++){
      str += digits[i];
    }
    int num = Integer.parseInt(str) + 1;
    str = "" + num;
    String[] intString = str.split("");
    int[] newArr = new int[intString.length];
    for(int j=0;j<newArr.length;j++){
      newArr[j] = Integer.parseInt(intString[j]);
    }
    return newArr;
  }
}
