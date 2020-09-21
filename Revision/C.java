class C{
  public static void main(String[] z){
    int[] arr = {6,9,8,12,25,4};
    int sum = 0;
    for(int i=0;i<arr.length;i++){
      int num = (int)Math.sqrt(arr[i]);
      if(num*num == arr[i]){sum+= num;}
    }
    System.out.println(sum);
  }
}