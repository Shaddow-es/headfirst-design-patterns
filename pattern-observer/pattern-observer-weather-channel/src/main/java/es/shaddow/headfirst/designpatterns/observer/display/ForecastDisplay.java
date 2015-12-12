package es.shaddow.headfirst.designpatterns.observer.display;

import es.shaddow.headfirst.designpatterns.observer.Observer;
import es.shaddow.headfirst.designpatterns.observer.model.WheatherData;

public class ForecastDisplay implements Observer, DisplayElement {

	private WheatherData wheaterData;

	private float lastPressure;
	private float currentPressure;

	// --------------------------------------------------------
	// -- Constructores
	// --------------------------------------------------------

	public ForecastDisplay(WheatherData wheaterData) {
		super();
		this.wheaterData = wheaterData;
		this.wheaterData.registerObserver(this);
	}

	// --------------------------------------------------------
	// -- Implementación Interfaz Observer
	// --------------------------------------------------------

	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
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
