public class TryMinVal {
  public static void main(String[] z){
    // if(Integer.parseInt("-91283472332") < Integer.MIN_VALUE){ return Integer.MIN_VALUE;}
    String str = "-91283472332";
    try{
      System.out.println(Integer.parseInt(str));
    } catch(Exception e){
      if(str.charAt(0) == '-'){
        System.out.println(Integer.MIN_VALUE);
      } else {
        System.out.println(Integer.MAX_VALUE);
      }
    }
    
  }
}
