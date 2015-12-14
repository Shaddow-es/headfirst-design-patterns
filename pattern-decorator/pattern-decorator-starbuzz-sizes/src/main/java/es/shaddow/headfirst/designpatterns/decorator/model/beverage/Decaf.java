package es.shaddow.headfirst.designpatterns.decorator.model.beverage;

public class Decaf extends Beverage {

	private static final double COST = 1.05;

	public Decaf() {
		super();
		description = "Decaf coffee";
	}

	@Override
	public double cost() {
		return COST;
	}

}
