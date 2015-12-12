package es.shaddow.headfirst.designpatterns.observer.display;

import java.util.Observable;
import java.util.Observer;

import es.shaddow.headfirst.designpatterns.observer.model.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

	private Observable observable;

	private float minTemp = Float.MAX_VALUE;
	private float maxTemp = Float.MIN_VALUE;
	private float tempSum;
	private int numReadings;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public StatisticsDisplay(Observable observable) {
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
			float temperature = weatherData.getTemperature();
			minTemp = Math.min(temperature, minTemp);
			maxTemp = Math.max(temperature, maxTemp);
			tempSum += temperature;
			numReadings++;
			display();
		}
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz DisplayElement
	// --------------------------------------------------------

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

}
