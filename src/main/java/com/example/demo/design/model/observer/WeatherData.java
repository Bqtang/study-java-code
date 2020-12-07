package com.example.demo.design.model.observer;

import java.util.ArrayList;

/**
 * @Description:
 * @Auther: tangbingqun
 * @Date: 2020/12/1 7:23 PM
 */

public class WeatherData  implements Subject {

     private ArrayList observers;
     private float temp;
     private float humidity;
     private float pressure;

     public WeatherData(){
          observers = new ArrayList();
     }

     @Override
     public void registerObserver(Observer observer) {
          observers.add(observer);

     }

     @Override
     public void removeObserver(Observer observer) {
          int i = observers.indexOf(observer);
          if (i > 0){
               observers.remove(i);
          }
     }

     @Override
     public void notifyObserver() {
          for (int i = 0; i < observers.size(); i++){
               Observer observer= (Observer) observers.get(i);
               observer.update(temp, humidity, pressure);
          }
     }

     public void measurementsChange(){
          notifyObserver();
     }

     public void setMeasuerments(float tmp, float humidity, float pressure){
          this.temp = temp;
          this.humidity = humidity;
          this.pressure = pressure;
          measurementsChange();
     }
}
