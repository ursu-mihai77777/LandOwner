package Landowner;

public class CircleBuilder  {
	private GenericPICalculator calculator;
	public CircleBuilder(double pi)
	{
		calculator = new PICalculator(pi);
	}
     public Circle buildCircle(double radius) {
    	 return new Circle(radius,calculator);
     }
     public void setPI(double pi)
     {
    	 calculator.setPI(pi);
    	 
     }
}
