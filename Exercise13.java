public class Exercise13 {
  public static void main(String[] z){
    int cash = 37;
    int tens = 0, fives = 0, twos = 0, ones = 0;
    tens = cash/10;
    fives = (cash - tens*10)/5;
    twos = (cash - tens*10 - fives*5)/2;
    ones = (cash - tens*10 - fives*5 - twos*2);
    System.out.println("Enter Cash: " + cash);
    System.out.println("$10 x " + tens);
    System.out.println("$5 x " + fives);
    System.out.println("$2 x " + twos);
    System.out.println("$1 x " + ones);
  }
}
