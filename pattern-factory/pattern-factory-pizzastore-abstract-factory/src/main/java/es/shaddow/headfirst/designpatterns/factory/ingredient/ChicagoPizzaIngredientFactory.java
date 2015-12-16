package es.shaddow.headfirst.designpatterns.factory.ingredient;

import es.shaddow.headfirst.designpatterns.factory.ingredient.cheese.Cheese;
import es.shaddow.headfirst.designpatterns.factory.ingredient.cheese.MozzarellaCheese;
import es.shaddow.headfirst.designpatterns.factory.ingredient.clam.Clams;
import es.shaddow.headfirst.designpatterns.factory.ingredient.clam.FrozenClams;
import es.shaddow.headfirst.designpatterns.factory.ingredient.dough.Dough;
import es.shaddow.headfirst.designpatterns.factory.ingredient.dough.ThickCrustDough;
import es.shaddow.headfirst.designpatterns.factory.ingredient.pepperoni.Pepperoni;
import es.shaddow.headfirst.designpatterns.factory.ingredient.pepperoni.SlicedPepperoni;
import es.shaddow.headfirst.designpatterns.factory.ingredient.sauce.PlumTomatoSauce;
import es.shaddow.headfirst.designpatterns.factory.ingredient.sauce.Sauce;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.BlackOlives;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Eggplant;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Spinach;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Spinach(), new BlackOlives(), new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}

}
