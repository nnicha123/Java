import java.util.*;
public class Ex1 {
  public static void main(String[] z){
    int[] arr = {3,2,4};
    int[] arr2 = twoSum(arr,9);
    for(int i=0;i<arr2.length;i++){ System.out.println(arr2[i]); }
  }
  public static int[] twoSum(int[] nums, int target){
    Arrays.sort(nums); int left=0; int right=nums.length-1;
    int[] newArr = {0,1};
    for(int i=0;i<nums.length;i++){ 
      while(left <= right){
        
        if(nums[left] + nums[right] == target){
          newArr[0] = left; newArr[1] = right;
          return newArr;
        } else{
          if(nums[left] + nums[right] < target){left++;}
          if(nums[left] + nums[right] > target){right--;}
        }
      }
     }
     return null;
  }
}
