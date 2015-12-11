package es.shaddow.headfirst.designpatterns.strategy;

import es.shaddow.headfirst.designpatterns.strategy.model.Duck;
import es.shaddow.headfirst.designpatterns.strategy.model.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}

}
