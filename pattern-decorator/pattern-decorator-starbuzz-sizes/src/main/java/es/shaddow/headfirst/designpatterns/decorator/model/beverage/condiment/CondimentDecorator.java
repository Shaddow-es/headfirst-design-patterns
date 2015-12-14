package es.shaddow.headfirst.designpatterns.decorator.model.beverage.condiment;

import es.shaddow.headfirst.designpatterns.decorator.model.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize(){
		return beverage.getSize();
	}
}
