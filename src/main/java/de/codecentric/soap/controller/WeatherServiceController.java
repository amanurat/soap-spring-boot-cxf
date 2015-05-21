package de.codecentric.soap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.codecentric.namespace.weatherservice.general.ForecastReturn;
import de.codecentric.soap.transformation.WeatherRepository;

@Component
public class WeatherServiceController {

	/*
	 *  Example of a Controller:
	 *  This Class would be responsible for Mapping from Request to internal Datamodel (and backwards),
	 *  for calling Backend-Services and handling Backend-Exceptions
	 *  So it decouples the WSDL-generated Classes from the internal Classes - for when the former changes,
	 *  nothing or only the mapping has to be changed
	 */ 
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	public ForecastReturn processRequest(String request) {
		
		return weatherRepository.getForecast(request);
	}
}