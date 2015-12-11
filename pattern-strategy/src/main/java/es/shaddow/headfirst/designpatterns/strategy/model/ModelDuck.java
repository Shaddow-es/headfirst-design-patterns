package es.shaddow.headfirst.designpatterns.strategy.model;

import es.shaddow.headfirst.designpatterns.strategy.behavihour.impl.FlyNoWay;
import es.shaddow.headfirst.designpatterns.strategy.behavihour.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super();
		quackBehaviour = new Quack();
		flyBehaviour = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I´m a model duck");
	}

}
