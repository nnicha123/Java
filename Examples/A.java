public class A {
  public static void main(String[] z){
    System.out.println(findDistance(3,4,0,0));
  }
  public static double findDistance(double x1,double y1, double x2, double y2){
    return Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
  }
}
