package es.shaddow.headfirst.designpatterns.observer.display;

import es.shaddow.headfirst.designpatterns.observer.Observer;
import es.shaddow.headfirst.designpatterns.observer.model.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private WeatherData weaterData;

	private float temperature;
	private float humidity;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public CurrentConditionsDisplay(WeatherData weatherData) {
		super();
		this.weaterData = weatherData;
		this.weaterData.registerObserver(this);
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
