import java.util.*;
public class D {
  public static void main(String[] z){
    int[] arr = {1,2,1,3,1,3,3,3,3};
    System.out.println(findMajority(arr));
  }
  public static int findMajority(int[] arr){
    Arrays.sort(arr);
    int count = 1;
    int maxCount = 1;
    int majorityVal = 0;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i] == arr[i+1]){count++;}
      if(arr[i] != arr[i+1]){
        if(count >= maxCount){
          maxCount = count;
          majorityVal = arr[i];
          count = 1;
        }
      }
      if(maxCount < count){
        maxCount = count;
        majorityVal = arr[i];
      }
    }
    if(maxCount*2 < arr.length){return -1;}
    return majorityVal;
  }
  
}
