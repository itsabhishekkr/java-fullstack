package com.cfs.Weather_App.dto;

import java.util.List;

public class myForcast {
    private WetherResponse wetherResponse;
    private List<DayTemp> dayTemp;

    public myForcast(WetherResponse wetherResponse, List<DayTemp> dayTemp) {
        this.wetherResponse = wetherResponse;
        this.dayTemp = dayTemp;
    }

    public myForcast() {
    }

    public WetherResponse getWetherResponse() {
        return wetherResponse;
    }

    public void setWetherResponse(WetherResponse wetherResponse) {
        this.wetherResponse = wetherResponse;
    }

    public List<DayTemp> getDayTemp() {
        return dayTemp;
    }

    public void setDayTemp(List<DayTemp> dayTemp) {
        this.dayTemp = dayTemp;
    }
}
