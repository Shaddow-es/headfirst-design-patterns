package es.shaddow.headfirst.designpatterns.observer.display;

import es.shaddow.headfirst.designpatterns.observer.Observer;
import es.shaddow.headfirst.designpatterns.observer.model.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

	private WeatherData weatherData;

	private float minTemp = Float.MAX_VALUE;
	private float maxTemp = Float.MIN_VALUE;
	private float tempSum;
	private int numReadings;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public StatisticsDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz Observer
	// --------------------------------------------------------

	public void update(float temperature, float humidity, float pressure) {
		minTemp = Math.min(temperature, minTemp);
		maxTemp = Math.max(temperature, maxTemp);
		tempSum += temperature;
		numReadings++;
		display();
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz DisplayElement
	// --------------------------------------------------------

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

}
