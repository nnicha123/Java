public class FootBall {
  public static void main(String[] z){
   go(3,""); 
  }
  public static void go(int rounds, String result){
    if(rounds == 0){System.out.println(result);}
    else{
      go(rounds-1,result+"W");
      go(rounds-1,result+"D");
      go(rounds-1,result+"L");
    }
  }
}
