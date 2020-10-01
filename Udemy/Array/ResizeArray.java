import java.util.*;
public class ResizeArray {
  private static Scanner s = new Scanner(System.in);
  private static int[] baseData = new int[10];

  public static void main(String[] z){
    System.out.println("Enter 10 numbers: ");
    getInput();
    printArray(baseData);
    resizeArray(13);
    printArray(baseData);
  }
  private static void getInput(){
    for(int i=0;i<baseData.length;i++){
      baseData[i] = s.nextInt();
    }
  }
  private static void printArray(int[] arr){
    System.out.println(Arrays.toString(arr));
  }
  private static void resizeArray(int size){
    int[] original = baseData;
    baseData = new int[size];
    for(int i=0;i<original.length;i++){
      baseData[i] = original[i];
    }
  }
}
