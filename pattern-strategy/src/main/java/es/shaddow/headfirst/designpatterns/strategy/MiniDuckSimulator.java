package es.shaddow.headfirst.designpatterns.strategy;

import es.shaddow.headfirst.designpatterns.strategy.behavihour.impl.FlyRocketPowered;
import es.shaddow.headfirst.designpatterns.strategy.model.Duck;
import es.shaddow.headfirst.designpatterns.strategy.model.MallardDuck;
import es.shaddow.headfirst.designpatterns.strategy.model.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}

}
