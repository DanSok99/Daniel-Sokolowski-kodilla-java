package com.kodilla.testing.weather.stub;

import com.sun.jdi.Value;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double averageTemperature(){
        int sum = 0;
        for(Map.Entry<String, Double> avgTemp : temperatures.getTemperatures().entrySet()){
            sum += avgTemp.getValue();
        }
        double average = sum / temperatures.getTemperatures().entrySet().size();
        return average;
    }
    public double medianTemperature(){
        double median = 0;
        int index = 0;
        List<Double> listTemp = new ArrayList<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            listTemp.add(temperature.getValue());
        }
        Collections.sort(listTemp);
        if(listTemp.size()%2 == 0){
            index = listTemp.size()/2;
            median = (listTemp.get(index-1)+listTemp.get(index))/2;
        }else{
            index = listTemp.size()/2;
            median = listTemp.get(index);
        }
        return median;
    }
}