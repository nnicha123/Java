import java.util.*;
public class Third {
  public static void main(String[] z){
    Die d = new Die();
    d.show();
    d.up();
    d.show();
    d.up();
    d.show();
    d.up();
    d.show();
    d.down();
    d.show();
  }
}
class Die{
  // int left,right,up,down,front,back;
  int face = 1;
  int up(){
    if(face == 6) face =1;
    else if(face == 3) face =6;
    else if(face == 1) face =3;
    return face;
  }
  int down(){
    if(face == 6) face =3;
    else if(face == 3) face =1;
    else if(face == 1) face =6;
    return face;
  }
  void show(){
    System.out.println(face);
  }
}
