import java.util.*;
public class ReverseArr {
  public static void main(String[] z){
    int[] myArray = {1,20,3,4,5};
    System.out.println(Arrays.toString(myArray));
    reverse(myArray);
    System.out.println(Arrays.toString(myArray));
  }
  public static void reverse(int[] array){
    for(int i=0;i<array.length/2;i++){
      int temp = array[i];
      array[i] = array[array.length-1-i];
      array[array.length-1-i] = temp;
    }
  }
}
