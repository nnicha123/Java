public class LongPressedName {
  public static void main(String[] z){
    System.out.println(isLongPressedName("leelee","lleeelee"));
  }
  public static boolean isLongPressedName(String name, String typed) {
    String newStr = "";
    newStr += typed.charAt(0);
    for(int i=0;i<typed.length()-1;i++){
        if(typed.charAt(i) != typed.charAt(i+1)){
            newStr += typed.charAt(i+1);
        }
    }
    System.out.println(newStr);
    if(newStr.equals(name)){return true;}
    else{return false;}
}
}
