package es.shaddow.headfirst.designpatterns.factory.pizza;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing " + getName());

		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println(" " + topping);
		}
	}

	public void bake() {
		System.out.println("Baking " + getName());
	}

	public void cut() {
		System.out.println("Cutting " + getName());
	}

	public void box() {
		System.out.println("Boxing " + getName());
	}

	public String getName() {
		return name;
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}
