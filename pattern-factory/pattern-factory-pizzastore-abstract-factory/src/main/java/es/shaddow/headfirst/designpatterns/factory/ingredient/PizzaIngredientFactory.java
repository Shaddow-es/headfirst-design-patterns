package es.shaddow.headfirst.designpatterns.factory.ingredient;

import es.shaddow.headfirst.designpatterns.factory.ingredient.cheese.Cheese;
import es.shaddow.headfirst.designpatterns.factory.ingredient.clam.Clams;
import es.shaddow.headfirst.designpatterns.factory.ingredient.dough.Dough;
import es.shaddow.headfirst.designpatterns.factory.ingredient.pepperoni.Pepperoni;
import es.shaddow.headfirst.designpatterns.factory.ingredient.sauce.Sauce;
import es.shaddow.headfirst.designpatterns.factory.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
}
