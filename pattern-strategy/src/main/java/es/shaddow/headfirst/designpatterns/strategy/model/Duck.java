package es.shaddow.headfirst.designpatterns.strategy.model;

import es.shaddow.headfirst.designpatterns.strategy.behavihour.FlyBehaviour;
import es.shaddow.headfirst.designpatterns.strategy.behavihour.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public Duck() {
	}

	public abstract void display();

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All duckt float, even decoys!");
	}
}
