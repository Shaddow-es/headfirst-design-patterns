package es.shaddow.headfirst.designpatterns.observer;

import es.shaddow.headfirst.designpatterns.observer.display.CurrentConditionsDisplay;
import es.shaddow.headfirst.designpatterns.observer.display.ForecastDisplay;
import es.shaddow.headfirst.designpatterns.observer.display.HeatIndexDisplay;
import es.shaddow.headfirst.designpatterns.observer.display.StatisticsDisplay;
import es.shaddow.headfirst.designpatterns.observer.model.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weaterData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weaterData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weaterData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weaterData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weaterData);

		weaterData.setMeasurements(80, 65, 30.4f);
		weaterData.setMeasurements(82, 70, 29.2f);
		weaterData.setMeasurements(78, 90, 29.2f);
	}

}
