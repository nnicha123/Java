public class Ex4 {
  public static void main(String[] z){
    String[] strings = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strings));
  }
  public static String longestCommonPrefix(String[] z){
    // System.out.println(z[1].length());
    // Find shortest string;
    int minLength = 255; String prefix = "";
    for(int i=0;i<z.length;i++){
      if(minLength > z[i].length()){minLength = z[i].length();}
    } 
    for(int k=0;k<z.length;k++){

      for(int j=0;j<minLength;j++){
        System.out.println(z[k].charAt(j));
      }
    }

    return z[0];
  }
}
