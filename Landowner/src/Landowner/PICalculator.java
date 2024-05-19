package Landowner;

public class PICalculator implements GenericPICalculator {
	private double pi;
	
	public PICalculator(double pi) {
		this.pi = pi;
	}

	public double computeArea(double radius) {
		return pi * radius * radius;
	}

	public void setPI(double pi) {
		this.pi = pi;
		
	}

}


