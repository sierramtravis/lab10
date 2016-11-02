// Lab 10
// <Sierra Travis>
// <61059>
import java.util.Scanner;
import java.util.ArrayList;
public class ObjectCalculator
{
    public static void main(String args[])
    {
       ArrayList<GeometricObject> objects = new ArrayList<GeometricObject>();
       // Create a Scanner to read input from the keyboard
       Scanner scan = new Scanner(System.in);
       // Prompt the user for a radius, get the radius from
       System.out.println("Input radius for circle");
       // the keyboard, and add the circle to the list of objects.
       double radius = scan.nextDouble();
       Circle myCircle = new Circle(radius); 
       objects.add(myCircle);
       // Prompt the user for a side length for an equilateral triangle.
       System.out.println("Input side for triangle");
       double side = scan.nextDouble();
       // Create an equilateral triangle with that side length and
       // add it to the list of objects.
       EquilateralTriangle myTriangle = new EquilateralTriangle(side, side, side);
       objects.add(myTriangle);
       // Prompt the user for the width and height of a rectangle.
       // Create a rectangle with that width and height and add it
       // to the list of objects.
       System.out.println("Input width for rectangle");
       double width = scan.nextDouble();
       System.out.println("Input length for rectangle");
       double length = scan.nextDouble();
       Rectangle myRectangle = new Rectangle(length, width); 
       objects.add(myRectangle);
       // Write a for loop that will print out all of the objects
       // in the list, along with their attributes (radius for circle,
       // width and height for rectangle, and side length for
       // equilateral triangle).

       // objects has 3 items
       // each iteration num is going to become 0 first, 1 second, 2 third
       // Create some variables to keep track of the total area and perimeter
       double totalArea = 0;
       double totalPerimeter = 0;		
      for (int counter = 0; counter < objects.size(); counter++)
      {
           
           totalArea = totalArea + objects.get(counter).getArea();
           totalPerimeter = totalPerimeter + objects.get(counter).getPerimeter();	
           		
      }
      
       // Write code that will calculate and print the total perimeter
       // and total area of all the objects in the list.
       System.out.println("totalArea: " + totalArea);
       System.out.println("totalPerimeter: " + totalPerimeter);
    }
}