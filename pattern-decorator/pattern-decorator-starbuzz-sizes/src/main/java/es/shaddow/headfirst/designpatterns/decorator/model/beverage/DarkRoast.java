package es.shaddow.headfirst.designpatterns.decorator.model.beverage;

public class DarkRoast extends Beverage {

	private static final double COST_TALL = 0.89;
	private static final double COST_GRANDE = 0.99;
	private static final double COST_VENTI = 1.09;

	public DarkRoast() {
		super();
		description = "Dark roast coffee";
	}

	@Override
	public double cost() {
		switch (getSize()) {
		case TALL:
			return COST_TALL;
		case GRANDE:
			return COST_GRANDE;
		case VENTI:
			return COST_VENTI;
		default:
			return 0;
		}
	}

}
