package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String continent;
    private List<Country> countryList = new ArrayList<>();

    public Continent(String continent){
        this.continent = continent;
    }
    public void addCountry(Country country){
        countryList.add(country);
    }
    public List<Country> getCountryList(){
        return countryList;
    }


}
