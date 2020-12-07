package com.example.demo.design.model.observer;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/12/1 7:42 PM
 */

public class StationDisplay implements DisplayElement , Observer{

     private WeatherData  weatherData;


     public StationDisplay(WeatherData  weatherData){
          this.weatherData = weatherData;
          weatherData.registerObserver(this);
     }

     @Override
     public void display() {
          System.out.println("显示数据StationDisplay");
     }

     @Override
     public void update(float temp, float humidity, float pressure) {
          weatherData.setMeasuerments(temp, humidity, pressure);

     }
}
