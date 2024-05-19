package Landowner;

public class IndianaPICalculator implements GenericPICalculator {

	
	
	private double pi;

	public IndianaPICalculator(double pi) {
		this.pi = pi;
	}

	@Override
	public double computeArea(double radius) {
		// TODO Auto-generated method stub
		return 2 * pi * radius;
	}

	@Override
	public void setPI(double pi) {
		this.pi = pi;
	}

}
