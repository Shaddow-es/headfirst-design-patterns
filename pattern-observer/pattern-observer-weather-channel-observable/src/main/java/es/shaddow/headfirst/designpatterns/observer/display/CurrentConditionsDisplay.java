package es.shaddow.headfirst.designpatterns.observer.display;

import java.util.Observable;
import java.util.Observer;

import es.shaddow.headfirst.designpatterns.observer.model.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Observable observable;

	private float temperature;
	private float humidity;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public CurrentConditionsDisplay(Observable observable) {
		super();
		this.observable = observable;
		this.observable.addObserver(this);
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz Observer
	// --------------------------------------------------------

	public void update(Observable observable, Object data) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			temperature = weatherData.getTemperature();
			humidity = weatherData.getHumidity();
			display();
		}

	}

	// --------------------------------------------------------
	// -- Implementación Interfaz DisplayElement
	// --------------------------------------------------------

	public void display() {
		System.out.println("Current conditions : " + temperature + "F defrees and " + humidity + "% humidity");
	}

}
