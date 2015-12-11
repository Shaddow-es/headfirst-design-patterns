package es.shaddow.headfirst.designpatterns.strategy.behavihour.impl;

import es.shaddow.headfirst.designpatterns.strategy.behavihour.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

	public void quack() {
		System.out.println("<< Silence >>");
	}

}
