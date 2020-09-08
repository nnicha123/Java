public class ExFour {
  public static void main(String[] z){
    int[] data = {3,2,4,1,6,5,8,6};
    int left=0;int right =data.length-1;
    while(true){
      if(data[left]%2 == 0 && data[right]%2==0){
        int tmp = data[left];
        data[left] = data[right];
        data[right] = tmp;
        left++;right--;
      }
      if(left<data.length && data[left]%2 != 0){left++;}
      if(right> 0 && data[right]%2 != 0){right--;}
      if(left >= right){break;}
    }
    for(int j=0;j<data.length;j++){
      System.out.println(data[j]);
    }
  }
}
