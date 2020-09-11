import java.util.*;
public class D {
  public static void main(String[] z){
    int[] a = {1,2,1,3,1}; int[] b = {1,1,2,2,2,2,1,1,1,1,3};
    System.out.println(findMajority(a));
    System.out.println(findMajority(b));
  }
  public static int findMajority(int[] arr){
    Arrays.sort(arr); int count = 1;
    for(int i=0;i<arr.length-1;i++) {
      if(arr[i] == arr[i+1]){count++;}
      if(arr[i] != arr[i+1]){count = 1;}
      if(count > arr.length/2){return arr[i];}
    }
    return 0;
  }
}
