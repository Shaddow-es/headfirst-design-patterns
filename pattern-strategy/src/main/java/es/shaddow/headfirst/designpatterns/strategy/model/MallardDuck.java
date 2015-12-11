package es.shaddow.headfirst.designpatterns.strategy.model;

import es.shaddow.headfirst.designpatterns.strategy.behavihour.impl.FlyWithWings;
import es.shaddow.headfirst.designpatterns.strategy.behavihour.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I´m a real Mallard duck");
	}

}
