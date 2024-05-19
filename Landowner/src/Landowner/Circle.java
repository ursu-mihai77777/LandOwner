package Landowner;

public class Circle implements Area {
	private double radius;
	private GenericPICalculator piCalculator;
	
	
	public Circle(double radius, GenericPICalculator piCalculator) {
		this.radius = radius;
		this.piCalculator = piCalculator;
	}


	public double computeArea() {
		return piCalculator.computeArea(radius);
	}

}


