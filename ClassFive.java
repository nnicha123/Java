public class ClassFive {
  public static void main(String[] z){
    Die d = new Die();
    d.show();
    d.up();
    d.up();
    d.show();
  }
}
class Die{
  int value = 1;
  void show(){
    System.out.println(value);
  }
  void up(){
    if(value == 1){value = 3;}
    else if(value == 3){value = 6;}
    else if(value == 6){value = 1;}
  }
}