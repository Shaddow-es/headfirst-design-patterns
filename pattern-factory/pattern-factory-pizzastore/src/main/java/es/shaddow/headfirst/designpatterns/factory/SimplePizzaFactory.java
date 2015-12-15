package es.shaddow.headfirst.designpatterns.factory;

import es.shaddow.headfirst.designpatterns.factory.pizza.CheesePizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.ClamPizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.PepperoniPizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.Pizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		} else if ("clam".equals(type)) {
			pizza = new ClamPizza();
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
