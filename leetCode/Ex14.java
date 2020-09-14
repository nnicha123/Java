import java.util.*;
public class Ex14 {
  public static void main(String[] z){
    int[] arr = {2,7,4,1,8,1};
    lastStoneWeight(arr);
  }
  public static int lastStoneWeight(int[] stones) {
      Arrays.sort(stones);

      int[] newArr = new int[stones.length-1];
      if(stones[stones.length-1] == stones[stones.length-2]){
        newArr[newArr.length-1] =0;
      } 
      if(stones[stones.length-1] != stones[stones.length-2]){
        int newInt = 0;
        if(stones[stones.length-1] > stones[stones.length-2]){
          newInt = stones[stones.length-1] - stones[stones.length-2];
        } else{
          newInt = stones[stones.length-2] - stones[stones.length-1];
        }
        newArr[newArr.length-1] = newInt;
      }
      for(int i=0;i<newArr.length-1;i++){
        newArr[i] = stones[i];
      }
      for(int j=0;j<newArr.length;j++){
        System.out.println(newArr[j]);
      }
      return 0;
  }
}
