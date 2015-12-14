package es.shaddow.headfirst.designpatterns.decorator.model.beverage;

public class HouseBlend extends Beverage {

	private static final double COST = 0.89;

	public HouseBlend() {
		super();
		description = "House blend coffee";
	}

	@Override
	public double cost() {
		return COST;
	}

}
