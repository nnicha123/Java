public class ClassSix {
  public static void main(String[] z){
    Domino d = new Domino('U','V');
    Domino e = new Domino('V','U');
    d.show();
    e.show();
    d.equals(e);
    d.rotate();
    d.equals(e);
  }
}
class Domino{
  char A,B;
  Domino(char A,char B){
    this.A = A;
    this.B = B;
  }
  void equals(Domino domino){
    if(domino.A == A && domino.B == B){
      System.out.println("Matched");
    } else{
      System.out.println("Unmatched");
    }
  }
  void show(){
    System.out.println("[" + A + ":" + B + "]");
  }
  void rotate(){
    char temp;
    temp = A;
    A = B;
    B = temp;
  }
}
