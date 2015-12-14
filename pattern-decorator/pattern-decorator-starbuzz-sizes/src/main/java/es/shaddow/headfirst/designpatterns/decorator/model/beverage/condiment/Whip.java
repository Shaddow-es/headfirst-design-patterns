package es.shaddow.headfirst.designpatterns.decorator.model.beverage.condiment;

import es.shaddow.headfirst.designpatterns.decorator.model.beverage.Beverage;

public class Whip extends CondimentDecorator {
	private static final double COST = 0.10;

	Beverage beverage;

	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + COST;
	}

}
