import java.util.*;
public class Ex12 {
  public static void main(String[] z){
    int[] arr = {3,2,3}; int target = 6;
    twoSum(arr,target);
  }
  public static int[] twoSum(int[] nums, int target) {
    int left = 0; int right = nums.length-1;
    int num1 = 0; int num2 = 0;
    
    int[] arrIndex = new int[2];
    int[] originalArr = new int[nums.length];
        
    if(nums[0] == nums[1] && nums.length ==2){
        if(nums[0] + nums[1] == target){
            arrIndex[0] = 0;
            arrIndex[1] = 1;
            return arrIndex;
        }
    }    
    for(int j = 0;j< originalArr.length;j++){
      originalArr[j] = nums[j];
    }
    Arrays.sort(nums);

    while(left < right){
        if(nums[left] + nums[right] > target){
            right--;
        }
        if(nums[left] + nums[right] < target){
            left++;
        }
        if(nums[left] + nums[right] == target){
            num1 = nums[left];
            num2 = nums[right];
            System.out.print(num1);
            System.out.println(num2);
            break;
    } 
  }
  if(num1 == num2){
    for(int z = 0;z<originalArr.length;z++){
      if(originalArr[z] == num1){arrIndex[0] = z; break;}
    }
    for(int x = arrIndex[0]+1;x<originalArr.length;x++){
      if(originalArr[x] == num2){arrIndex[1] = x; break;}
    }
  }
  else{
    for(int k = 0;k<originalArr.length;k++){
      if(originalArr[k] == num1){arrIndex[0] = k;}
      if(originalArr[k] == num2){arrIndex[1] = k;}
    }
  }
  return arrIndex;
}
}