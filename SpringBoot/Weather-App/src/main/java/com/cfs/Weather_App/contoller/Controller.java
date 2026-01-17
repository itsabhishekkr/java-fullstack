package com.cfs.Weather_App.contoller;

import com.cfs.Weather_App.dto.Root;
import com.cfs.Weather_App.dto.WetherResponse;
import com.cfs.Weather_App.dto.myForcast;
import com.cfs.Weather_App.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class Controller {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public String getWeatherData(@PathVariable String city) {
        return weatherService.test();
    }

    @GetMapping("/my/{city}")
    public WetherResponse getWeather(@PathVariable String city) {
        return weatherService.getData(city);
    }


    @GetMapping("/forcast")
    public myForcast CityWithDays(@RequestParam String city, @RequestParam int days) {
        return weatherService.getForcast(city,days);
    }

}
