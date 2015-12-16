package es.shaddow.headfirst.designpatterns.factory.ingredient;

import es.shaddow.headfirst.designpatterns.factory.ingredient.cheese.Cheese;
import es.shaddow.headfirst.designpatterns.factory.ingredient.cheese.ReggianoCheese;
import es.shaddow.headfirst.designpatterns.factory.ingredient.clam.Clams;
import es.shaddow.headfirst.designpatterns.factory.ingredient.clam.FreshClams;
import es.shaddow.headfirst.designpatterns.factory.ingredient.dough.Dough;
import es.shaddow.headfirst.designpatterns.factory.ingredient.dough.ThinCrustDough;
import es.shaddow.headfirst.designpatterns.factory.ingredient.pepperoni.Pepperoni;
import es.shaddow.headfirst.designpatterns.factory.ingredient.pepperoni.SlicedPepperoni;
import es.shaddow.headfirst.designpatterns.factory.ingredient.sauce.MarinaraSauce;
import es.shaddow.headfirst.designpatterns.factory.ingredient.sauce.Sauce;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Garlic;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Mushroom;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Onion;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.RedPepper;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}

}
