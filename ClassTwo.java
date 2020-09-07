public class ClassTwo {
  public static void main(String[] z){
    Circle c = new Circle(5.2);
    double a = c.getArea();
    System.out.println(a);
    Triangle t = new Triangle(2.5,4.0);
    double triangleArea = t.getArea();
    System.out.println(triangleArea);
  }
}
class Circle{
  double radius;
  Circle(double radius){
    this.radius = radius;
  }
  double getArea(){
    return Math.PI*radius*radius;
  }
}
class Triangle{
  double base,height;
  Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }
  double getArea(){
    return 0.5*base*height;
  }
}
