package es.shaddow.headfirst.designpatterns.strategy.behavihour.impl;

import es.shaddow.headfirst.designpatterns.strategy.behavihour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

	public void fly() {
		System.out.println("I´m flying!");
	}

}