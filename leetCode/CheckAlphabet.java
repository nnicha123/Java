public class CheckAlphabet {
  public static void main(String[] z){
    String str = "A man, a plan, a canal: Panama";
    str = str.toLowerCase();
    String newStr = "";
    char[] c = str.toCharArray();
    for(int i=0;i<c.length;i++){
      if((c[i]>= 'a' && c[i] <= 'z')){
        newStr += c[i];
      }
    }
    char[] newChar = newStr.toCharArray();
    int left = 0; int right = newChar.length -1;
    while(left < right){
      if(newChar[left] != newChar[right]){return false;}
      left++; right--;
    }
    return true;
    System.out.println(newStr);
  }
}
