/**
 * Point class that allows the construction, reading, and storing
 * of Points. 
 * @author Brigitta Szepesi
 */
import java.util.*;

public class Point{
  private double x, y;

  //the constructor that initializes the points x & y 
  //appropriately
  public Point(double a, double b){
    this.x = a;
    this.y = b;
  }

  //the method that reads an x and a y value from the scanner 
  //and returns the associated point
  public static Point read(Scanner sc){
    double x = sc.nextDouble(); 
    double y = sc.nextDouble();
    Point p = new Point(x, y);
    return p;
  }

  //the method that returns a String consisting of 
  //the x-coordinate, a space, and the y-coordinate
  public String toString(){
    String str = new String();
    str = this.x + " " + this.y;
    return str;
  }

  public double getX(){
    return this.x;
  }
  public double getY(){
    return this.y;
  }
  public void setX(double xin){
    this.x = xin;
  }
  public void setY(double yin){
    this.y = yin;
  }
}
