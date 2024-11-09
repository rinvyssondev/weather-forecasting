package com.weatherforecasting.weatherforecasting;

import com.weatherforecasting.weatherforecasting.service.*;

public class ServiceFactory {
    public static Forecast5Service createForecast5Service() {
        return new Forecast5Impl();
    }

    public static PrevisionService createPrevisionService() {
        return new PrevisionServiceImpl();
    }

    public static WeatherService createWeatherService() {
        return new WeatherServiceImpl();
    }
}
