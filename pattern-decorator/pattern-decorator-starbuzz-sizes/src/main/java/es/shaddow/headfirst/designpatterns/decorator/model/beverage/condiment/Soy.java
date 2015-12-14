package es.shaddow.headfirst.designpatterns.decorator.model.beverage.condiment;

import es.shaddow.headfirst.designpatterns.decorator.model.beverage.Beverage;

public class Soy extends CondimentDecorator {

	private static final double COST_TALL = 0.10;
	private static final double COST_GRANDE = 0.15;
	private static final double COST_VENTI = 0.20;

	Beverage beverage;

	public Soy(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {

		switch (beverage.getSize()) {
		case TALL:
			return beverage.cost() + COST_TALL;
		case GRANDE:
			return beverage.cost() + COST_GRANDE;
		case VENTI:
			return beverage.cost() + COST_VENTI;
		default:
			return beverage.cost();
		}

	}

}
