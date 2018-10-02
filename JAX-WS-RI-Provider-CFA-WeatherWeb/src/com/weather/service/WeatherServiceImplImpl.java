package com.weather.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.weather.service.WeatherServiceImpl")
public class WeatherServiceImplImpl implements WeatherServiceImpl {

	@Override
	public double getTemperature(int zip) {
		return 45.90;
	}

}
