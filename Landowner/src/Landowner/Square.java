package Landowner;

public class Square implements Area {
   
   private double length;
  
   public Square(double length)
   { 
     this.length=length;
   }
   public double computeArea()
   {
	   return length*length;
   }
  
   
}
