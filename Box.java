/**
 * Lab03 is the user interface for the box and point
 * program
 * @author Brigitta Szepesi
 */
import java.util.*;
import java.lang.Math; 

public class Box {
  private Point min;
  private Point max;
  // constructor for Box that consists of a single point
  public Box(Point p) {
    this.min = new Point(p.getX(), p.getY());
    this.max = new Point(p.getX(), p.getY());
  }

  // constructor for the Box containing two initial points
  public Box(Point a, Point b) {
    //Set max and min x values for box
    if(a.getX() >= b.getX()){
      this.max.setX(a.getX());
      this.min.setX(b.getX());
    }
    else{
      this.max.setX(b.getX());
      this.min.setX(a.getX());
    }
    //Set max and min y values for box
    if(a.getY() >= b.getY()){
      this.max.setY(a.getY());
      this.min.setY(b.getY());
    }
    else{
      this.max.setY(b.getY());
      this.min.setY(a.getY());
    }
  }

  // growBy(p) expands the bounding box (if needed) to include point p
  public void growBy(Point p) {
    
    //Set max and min x values for box
    if(this.max.getX() < p.getX()){
      double set = p.getX();
      this.max.setX(set);
    }
    if(this.min.getX() > p.getX()){
      this.min.setX(p.getX());
    }

    //Set max and min y values for box
    if(this.max.getY() < p.getY()){
      this.max.setY(p.getY());
    }
    if(this.min.getY() > p.getY()){
      this.min.setY(p.getY());
    }
  }

  // given point p in the bounding box, returns associated point in the
  // unit square (see notes); returns null if p is not inside the bounding box.
  public Point mapIntoUnitSquare(Point p) {
    //return null if p is not inside the bounding box
    if(p.getX() > this.max.getX()){
      return null;
    }
    if(p.getX() < this.min.getX()){
      return null;
    }
    if(p.getY() > this.max.getY()){
      return null;
    }
    if(p.getY() < this.min.getY()){
      return null;
    }

    //convert to unit square point
    Double unitX = (p.getX()-this.min.getX()) / (this.max.getX()-this.min.getX());
    Double unitY = (p.getY()-this.min.getY()) / (this.max.getY()-this.min.getY());
    Point q = new Point(unitX, unitY);
    return q;
  }

  // returns string representation like: 2.0 < x < 9.0, 3.0 < y < 7.0
  public String toString() {
    String bounds = this.min.getX() + " < x < " + this.max.getX() + ", "
      + this.min.getY() + " < y < " + this.max.getY() + "\n";
    return bounds; 
  }
}
