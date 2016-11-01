      // Lab 10
      // <Sierra Travis>
      // <61059>
      import java.lang.*;
      
      public class Circle extends GeometricObject
      {
      	  private double radius;
      	  
      	  Circle (double radius) 
      	  {
      	  	this.radius = radius;
      	  }
      	  
          public double getArea()
          {
            return 3.14 * Math.pow(this.radius,2);
          }
          
          public double getPerimeter()
          {
            
             return 2 * 3.14 * this.radius ;
          }
          
          public String toString()
          {
             return "Circle: Area=" + this.getArea() + ", Perimeter=" + this.getPerimeter();
          }

       }
       
   
