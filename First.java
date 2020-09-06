// import java.io.*;
import java.util.*;
public class First {
  public static void main(String[] z){
    Triangle t = new Triangle();
    double area = t.getArea(2.5,4);
    System.out.println(area);
  }
}
class Triangle{
  double getArea(double width, double height){
    return 0.5*width*height;
  }
}
