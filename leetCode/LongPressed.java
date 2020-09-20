public class LongPressed {
  public static void main(String[] z){
    System.out.println(isLongPressedName("alexxx","aaleexx"));
    System.out.println(isLongPressedName("saeed","ssaaedd"));
  }
  public static boolean isLongPressedName(String name, String typed){
    char[] c1 = name.toCharArray();
    char[] c2 = typed.toCharArray();
    int left = 0; int right = 0;
    while(left < c1.length-1 && right < c2.length-1){
      if(right == c2.length-1 && left != c1.length-1){return false;}
      if(left == c1.length || right == c2.length){return false;}
      System.out.println(c1[left] + " " + c2[right]);
      if(c1[left] == c2[right]){right++;}
      if(c1[left] != c2[right]){
        left++;
        if(c1[left] != c2[right]){return false;}
      }
    }
    return true;
  }
}
