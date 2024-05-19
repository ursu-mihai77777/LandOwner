package Landowner;



public class IndianaCircleBuilder {
	private GenericPICalculator calculator;
	public IndianaCircleBuilder(double pi) {
		calculator= new IndianaPICalculator(pi);
	}
	public Circle buildCircle(double radius) {
		return new Circle(radius,calculator);
	}
	public void setPi(double pi)
	{
		calculator.setPI(pi);
	}

}
