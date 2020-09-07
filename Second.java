import java.util.*;
public class Second {
  public static void main(String[] z){
    Domino d = new Domino();
    d.left = 3;
    d.right = 5;
    d.show();
  }
}
class Domino{
  int left;
  int right;
  void show(){
    System.out.println("["+left+":"+ right + "]");
  }
}
