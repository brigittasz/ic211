/**
 * Lab03 is the user interface for the box and point
 * program
 * @author Brigitta Szepesi
 */
import java.util.*;

public class Lab03{
  public static void main(String[] args) {
    //initialize relevant variables for later use 
    Scanner scanner = new Scanner(System.in);
    String str = new String();
    Point p = null;
    Box b = null;
    int count = 0;

    //check if there is a next word
    while(scanner.hasNext()){
      str = scanner.next();
      //check for commands and match functions

      //add the point to the box
      //read the point then grow the box
      if(str.equals("add")){
        if(count == 0){
          b = new Box(Point.read(scanner));
          count++;
        }
        else{
          b.growBy(Point.read(scanner));
        }
      }

      //display the box boundaries
      else if(str.equals("box")){
        String str1 = b.toString();
        System.out.print(str1);
      }

      //map the point to a unit square
      //account for the possibility of 
      //the point being outside the boundaries
      else if(str.equals("map")){
        p = Point.read(scanner);
        p = b.mapIntoUnitSquare(p);
        if(p==null){
          System.out.println("error");
        }
        else{
          String str1 = p.toString();
          System.out.println(str1);
        }
      }

      //quit program when user enters 
      //the command done
      else if(str.equals("done")){
        return;
      }
      //if user enters any other command
      //display error message
      else{
        System.out.println("Error! Unknown command \"" + str + "\"!");
      }
    }
  }
}

