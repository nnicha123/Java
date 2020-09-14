public class TargetTwo {
  static int[] nums = {1,2,3,4,5};
  public static void main(String[] z){
    int target = 10;
    go(target,"");
  }
  public static void go(int current, String result){
    if(current == 0){System.out.println(result);}
    else{
      for(int i=0;i<nums.length;i++){
        if(current - nums[i] >= 0){go(current - nums[i], result+nums[i]);}        
      }
    }
  }
}
