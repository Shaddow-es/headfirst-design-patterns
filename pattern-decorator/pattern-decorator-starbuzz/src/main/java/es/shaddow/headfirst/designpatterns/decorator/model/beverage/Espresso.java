package es.shaddow.headfirst.designpatterns.decorator.model.beverage;

public class Espresso extends Beverage {

	private static final double COST = 1.99;

	public Espresso() {
		super();
		description = "Espresso";
	}

	@Override
	public double cost() {
		return COST;
	}

}
