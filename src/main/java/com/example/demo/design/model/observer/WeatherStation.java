package com.example.demo.design.model.observer;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/12/1 7:40 PM
 */

public class WeatherStation {

     public static void main(String[] args) {
          WeatherData  weatherData = new WeatherData();

          CurrentConditionsDisplay  display = new CurrentConditionsDisplay(weatherData);
          StationDisplay stationDisplay = new StationDisplay(weatherData);


          weatherData.setMeasuerments(10,12,13);
          weatherData.setMeasuerments(1,2,3);



     }

}
