import java.util.*;
public class Ex15 {
  public static void main(String[] z){
    int[] arr = {2,7,4,1,8,1};
    lastStoneWeight(arr);
  }
  public static int lastStoneWeight(int[] stones){
    
    while(stones.length > 1){
      Arrays.sort(stones);
      String str = "";
      
    for(int i=0;i<stones.length-1;i++){
      str += stones[i];
    }
    int lastValue = 0;
    System.out.println(stones[stones.length-1]);
    if(stones[stones.length-1] != stones[stones.length-2]){
      if(stones[stones.length-1] > stones[stones.length-2]){
        lastValue = stones[stones.length-1] - stones[stones.length-2];
      } else {
        lastValue = stones[stones.length-2] - stones[stones.length-1];
      }
      str += lastValue;
    }
    
    // System.out.println(str);
    char[] c = str.toCharArray();

    stones = new int[str.length()];
    for(int k=0;k<stones.length;k++){
      stones[k] = (int)str.charAt(k);
    }
    }

    return 0;
  }
}
