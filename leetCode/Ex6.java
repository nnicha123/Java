class Ex6{
  public static void main(String[] z){
    int[] arr = {1,2};
    System.out.println(rob(arr));
  }
  public static int rob(int[] nums) {
    int sumOne = 0; int sumTwo = 0;
    for(int i =0;i<nums.length;i=i+2){
        sumOne += nums[i];
    }
    for(int j=1;j<nums.length;j=j+2){
        sumTwo += nums[j];
    }
    return sumOne > sumTwo ? sumOne : sumTwo;
}

}