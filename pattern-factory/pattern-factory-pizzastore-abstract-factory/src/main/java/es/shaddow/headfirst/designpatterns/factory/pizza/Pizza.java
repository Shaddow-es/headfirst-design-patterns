package es.shaddow.headfirst.designpatterns.factory.pizza;

import es.shaddow.headfirst.designpatterns.factory.ingredient.cheese.Cheese;
import es.shaddow.headfirst.designpatterns.factory.ingredient.clam.Clams;
import es.shaddow.headfirst.designpatterns.factory.ingredient.dough.Dough;
import es.shaddow.headfirst.designpatterns.factory.ingredient.pepperoni.Pepperoni;
import es.shaddow.headfirst.designpatterns.factory.ingredient.sauce.Sauce;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Veggies;

public abstract class Pizza {

	String name;

	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		return display.toString();
	}
}
