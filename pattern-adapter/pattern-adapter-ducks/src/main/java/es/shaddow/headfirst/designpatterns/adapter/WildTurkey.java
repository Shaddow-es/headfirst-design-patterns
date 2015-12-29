package es.shaddow.headfirst.designpatterns.adapter;

public class WildTurkey implements Turkey {

	public void gobble() {
		System.out.println("Gobble gobble");
	}

	public void fly() {
		System.out.println("I´m flyinga short distance");
	}
}
