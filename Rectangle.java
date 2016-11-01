 // Lab 10
      // <Sierra Travis>
      // <61059>
      import java.lang.*;
      
      public class Rectangle extends GeometricObject
      {
      	  private double length, width;
      	  
      	  Rectangle (double length, double width) 
      	  {
      	  	this.length = length;
            this.width = width;
      	  }
      	  
          public double getArea()
          {
            return this.length * this.width;
          }
          
          public double getPerimeter()
          {
            
             return 2 *this.length + 2 * this.width ;
          }
          
          public String toString()
          {
             return "Rectangle: Area=" + this.getArea() + ", Perimeter=" + this.getPerimeter();
          }

       }
       
   
