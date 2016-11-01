// Lab 10
      // <Sierra Travis>
      // <61059>
      import java.lang.*;
      
      public class EquilateralTriangle extends GeometricObject
      {
      	  private double a, b, c, s;
      	  
      	  EquilateralTriangle (double a, double b, double c) 
      	  {
      	  	this.a = a;
            this.b = b;
            this.c = c;
            this.s = this.getPerimeter();
      	  }
      	  
          public double getArea()
          {
            return Math.sqrt(this.s * (this.s - this.a) * (this.s - this.b) * (this.s - this.c));
          }
          
          public double getPerimeter()
          {
            
             return (this.a + this.b + this.c) / (2);
          }
          
          public String toString()
          {
             return "EquilateralTriangle: Area=" + this.getArea() + ", SemiPerimeter=" + this.getPerimeter();
          }

       }
       
   
