package es.shaddow.headfirst.designpatterns.decorator.model.beverage;

public class DarkRoast extends Beverage {

	private static final double COST = 0.99;

	public DarkRoast() {
		super();
		description = "Dark roast coffee";
	}

	@Override
	public double cost() {
		return COST;
	}

}
