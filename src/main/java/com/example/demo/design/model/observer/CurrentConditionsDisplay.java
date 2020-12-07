package com.example.demo.design.model.observer;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/12/1 7:34 PM
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {


     private float temp;
     private float humidity;
     private Subject weatherData;


     public CurrentConditionsDisplay(Subject weatherData) {
          this.weatherData = weatherData;
          weatherData.registerObserver(this);
     }

     @Override
     public void update(float temp, float humidity, float pressure) {
          this.temp = temp;
          this.humidity = humidity;
          display();

     }

     @Override
     public void display() {
          System.out.println("显示成功CurrentConditionsDisplay");
     }


}
