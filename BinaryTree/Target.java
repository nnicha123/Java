public class Target {
  public static void main(String[] z){
    go(8,"");
  }
  public static void go(int target, String result){
    if(target == 0){System.out.println(result);}
    else{
      if(target-1 >= 0){go(target-1,result+"1");}
      if(target-4 >= 0){go(target-4,result+"4");}
      if(target-5 >= 0){go(target-5,result+"5");}
    }
  }
}
