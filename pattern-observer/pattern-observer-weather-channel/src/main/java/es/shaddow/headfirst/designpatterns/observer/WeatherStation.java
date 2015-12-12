package es.shaddow.headfirst.designpatterns.observer;

import es.shaddow.headfirst.designpatterns.observer.display.CurrentConditionsDisplay;
import es.shaddow.headfirst.designpatterns.observer.display.ForecastDisplay;
import es.shaddow.headfirst.designpatterns.observer.display.StatisticsDisplay;
import es.shaddow.headfirst.designpatterns.observer.model.WheatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WheatherData wheaterData = new WheatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(wheaterData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wheaterData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(wheaterData);

		wheaterData.setMeasurements(80, 65, 30.4f);
		wheaterData.setMeasurements(82, 70, 29.2f);
		wheaterData.setMeasurements(78, 90, 29.2f);
	}

}
