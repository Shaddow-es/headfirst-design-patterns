package es.shaddow.headfirst.designpatterns.observer.model;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public WeatherData() {
		super();
	}

	// --------------------------------------------------------
	// -- Método públicos
	// --------------------------------------------------------

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// --------------------------------------------------------
	// -- Getters / Setters
	// --------------------------------------------------------

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
