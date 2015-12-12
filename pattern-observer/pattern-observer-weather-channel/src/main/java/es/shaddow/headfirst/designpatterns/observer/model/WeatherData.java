package es.shaddow.headfirst.designpatterns.observer.model;

import java.util.ArrayList;
import java.util.List;

import es.shaddow.headfirst.designpatterns.observer.Observer;
import es.shaddow.headfirst.designpatterns.observer.Subject;

public class WeatherData implements Subject {

	private List<Observer> observers;

	private float temperature;
	private float humidity;
	private float pressure;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public WeatherData() {
		super();
		observers = new ArrayList<Observer>();
	}

	// --------------------------------------------------------
	// -- Método públicos
	// --------------------------------------------------------

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz Subject
	// --------------------------------------------------------

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
}
