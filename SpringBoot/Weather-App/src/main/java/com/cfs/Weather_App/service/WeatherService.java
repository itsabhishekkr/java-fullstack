package com.cfs.Weather_App.service;

import com.cfs.Weather_App.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;
    @Value("${weather.api.url}")
    private String apiUrl;
    @Value("${weather.forcast.url}")
    private String forcastUrl;

    private RestTemplate template = new RestTemplate();

    public String test(){
        return "test";
    }
    //http://api.weatherapi.com/v1/current.json?key=8238a17f35f04619abb85808261601&q=Ranchi

    public WetherResponse getData(String city){
        String url = apiUrl+"?key="+apiKey+"&q="+city;
        Root respose = template.getForObject(url,Root.class);

        WetherResponse wetherResponse = new WetherResponse();

        wetherResponse.setCity(respose.getLocation().getName());
        wetherResponse.setCountry(respose.getLocation().getCountry());
        wetherResponse.setRegion(respose.getLocation().getRegion());
        wetherResponse.setTemperature(respose.getCurrent().getTemp_c());
        wetherResponse.setCondition(respose.getCurrent().getCondition().getText());

        return wetherResponse;
    }
    public myForcast getForcast(String city, int days){
        String url = forcastUrl+"?key="+apiKey+"&q="+city+"&days="+days;
        Root respose = template.getForObject(url,Root.class);


        WetherResponse wetherResponse = getData(city);

        myForcast myFor = new myForcast();
        myFor.setWetherResponse(wetherResponse);

        ArrayList<DayTemp> tempday = new ArrayList<DayTemp>();
        for(Forecastday f:respose.getForecast().getForecastday()){
            //DayTemp(LocalDate date, Double minTemp, Double maxTemp, Double avgTemp)
            tempday.add(new DayTemp(f.getDate(),f.getDay().getMintemp_c(),f.getDay().getMaxtemp_c(),f.getDay().getAvgtemp_c()));
        }
        myFor.setDayTemp(tempday);


        return myFor;
    }

}
