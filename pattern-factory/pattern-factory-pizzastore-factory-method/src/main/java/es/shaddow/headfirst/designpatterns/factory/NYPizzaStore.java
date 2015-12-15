package es.shaddow.headfirst.designpatterns.factory;

import es.shaddow.headfirst.designpatterns.factory.pizza.NYStyleCheesePizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.NYStyleClamPizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.NYStylePepperoniPizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.NYStyleVeggiePizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new NYStyleCheesePizza();
		} else if ("veggie".equals(type)) {
			return new NYStyleVeggiePizza();
		} else if ("clam".equals(type)) {
			return new NYStyleClamPizza();
		} else if ("pepperoni".equals(type)) {
			return new NYStylePepperoniPizza();
		} else {
			return null;
		}
	}

}
