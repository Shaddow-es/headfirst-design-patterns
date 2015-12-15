package es.shaddow.headfirst.designpatterns.factory;

import es.shaddow.headfirst.designpatterns.factory.pizza.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We orderder a " + pizza.getName() + "\n");
		System.out.println(pizza);

		pizza = store.orderPizza("veggie");
		System.out.println("We orderder a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
