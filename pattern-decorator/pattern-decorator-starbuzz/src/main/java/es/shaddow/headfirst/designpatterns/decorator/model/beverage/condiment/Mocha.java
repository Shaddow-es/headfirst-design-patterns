package es.shaddow.headfirst.designpatterns.decorator.model.beverage.condiment;

import es.shaddow.headfirst.designpatterns.decorator.model.beverage.Beverage;

public class Mocha extends CondimentDecorator {
	private static final double COST = 0.20;

	Beverage beverage;

	public Mocha(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + COST;
	}

}
