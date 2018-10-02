package com.ibm.services;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ibm.services.IWeatherForecast")
public class WeatherForeCastImpl implements IWeatherForecast {

	@Override
	public double getTemperature(int zipcode) {
		double temperature = 0.0;

		if (zipcode == 500081) {
			temperature = 25.05;
		} else if (zipcode == 500032) {
			temperature = 28.65;
		}

		return temperature;
	}

	@Override
	public boolean willItRainToday(int zipcode) {
		if (zipcode == 500081) {
			return true;
		}
		return false;
	}

}
