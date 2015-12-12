package es.shaddow.headfirst.designpatterns.observer.display;

import java.util.Observable;
import java.util.Observer;

import es.shaddow.headfirst.designpatterns.observer.model.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

	private Observable observable;

	private float lastPressure;
	private float currentPressure;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public ForecastDisplay(Observable observable) {
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
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz DisplayElement
	// --------------------------------------------------------

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
