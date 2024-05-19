package Landowner;

public class Rectangle implements Area {

	private double length;
	private double width;
	  
	   public Rectangle(double length,double width)
	   { 
	     this.length=length;
	     this.width=width;
	   }
	   public double computeArea()
	   {
		   return width*length;
	   }
	  
	   
	}
