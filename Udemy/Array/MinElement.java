import java.util.*;
public class MinElement {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] z){
    int[] array = readIntegers(5);
    System.out.println(Arrays.toString(array));
    System.out.println("Minimum is: " + findMin(array));
  }
  public static int[] readIntegers(int count){
    int[] array = new int[count];
    System.out.print("Enter " + count + " numbers: ");
    for(int i=0;i<count;i++){
      array[i] = scanner.nextInt();
    }
    return array;
  }
  public static int findMin(int[] array){
    int min=Integer.MAX_VALUE;
    for(int i=0;i<array.length;i++){
      if(min > array[i]) min = array[i];
    }
    return min;
  }
}
