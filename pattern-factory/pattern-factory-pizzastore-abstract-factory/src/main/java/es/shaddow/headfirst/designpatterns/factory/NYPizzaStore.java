package es.shaddow.headfirst.designpatterns.factory;

import es.shaddow.headfirst.designpatterns.factory.ingredient.NYPizzaIngredientFactory;
import es.shaddow.headfirst.designpatterns.factory.ingredient.PizzaIngredientFactory;
import es.shaddow.headfirst.designpatterns.factory.pizza.CheesePizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.ClamPizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.PepperoniPizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.Pizza;
import es.shaddow.headfirst.designpatterns.factory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if ("cheese".equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York style cheese pizza");
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York style veggie pizza");
		} else if ("clam".equals(type)) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York style clam pizza");
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York style pepperoni pizza");
		}

		return pizza;
	}

}
