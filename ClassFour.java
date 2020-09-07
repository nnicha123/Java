public class ClassFour {
  public static void main(String[] z){
    Point p = new Point(3.5,2.8);
    Point q = new Point(2.8,3.5);
    Point r = new Point(2.8,7.0/2);
    q.equals(r);
    q.equals(p);
    q.rotate();
    q.equals(p);
  }
}
class Point{
  double pointOne,pointTwo;
  Point(double pointOne, double pointTwo){
    this.pointOne = pointOne;
    this.pointTwo = pointTwo;
  }
  void equals(Point comparePoint){
    if(comparePoint.pointOne == pointOne && comparePoint.pointTwo == pointTwo){
      System.out.println("Equals");
    } else{
      System.out.println("Not Equal");
    }
    return ;
  }
  void rotate(){
    double temp;
    temp = pointOne;
    pointOne = pointTwo;
    pointTwo = temp;
  }
}