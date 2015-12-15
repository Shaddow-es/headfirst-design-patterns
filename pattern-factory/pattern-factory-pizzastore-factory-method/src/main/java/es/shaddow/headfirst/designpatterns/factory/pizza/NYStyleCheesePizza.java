package es.shaddow.headfirst.designpatterns.factory.pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NY style sauce and cheese pizza";
		dough = "Thin crust dough";
		sauce = "Marinara sauce";

		toppings.add("Grated raggiano cheese");
	}
}
