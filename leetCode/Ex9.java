public class Ex9 {
  public static void main(String[] z){
    int[] arr = {0,1,0,3,12};
    moveZeroes(arr);
  }
  public static void moveZeroes(int[] nums) {
    int left = 0; int right = 1;
    while(left <= right && right < nums.length-1){
        if(left ==0 && right != 0){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        if(left !=0 && right == 0){
            left++; right++;
        }
        if(left == 0 && right == 0){
            right++;
        }
        if(left != 0 && right == 0){
            left++; right++;
        }
    }
    for(int i=0;i<nums.length;i++){
      System.out.println(nums[i]);
    }
  }
}
