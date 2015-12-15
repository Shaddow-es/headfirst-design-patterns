package es.shaddow.headfirst.designpatterns.factory;

import es.shaddow.headfirst.designpatterns.factory.pizza.ChicagoStyleCheesePizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.ChicagoStyleClamPizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.ChicagoStylePepperoniPizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.ChicagoStyleVeggiePizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new ChicagoStyleCheesePizza();
		} else if ("veggie".equals(type)) {
			return new ChicagoStyleVeggiePizza();
		} else if ("clam".equals(type)) {
			return new ChicagoStyleClamPizza();
		} else if ("pepperoni".equals(type)) {
			return new ChicagoStylePepperoniPizza();
		} else {
			return null;
		}
	}

}
