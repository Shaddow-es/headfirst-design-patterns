package es.shaddow.headfirst.designpatterns.observer.display;

import es.shaddow.headfirst.designpatterns.observer.Observer;
import es.shaddow.headfirst.designpatterns.observer.model.WheatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private WheatherData wheaterData;

	private float temperature;
	private float humidity;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public CurrentConditionsDisplay(WheatherData wheaterData) {
		super();
		this.wheaterData = wheaterData;
		this.wheaterData.registerObserver(this);
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz Observer
	// --------------------------------------------------------

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz DisplayElement
	// --------------------------------------------------------

	public void display() {
		System.out.println("Current conditions : " + temperature + "F defrees and " + humidity + "% humidity");
	}

}
