package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {

        //Given
        Country country1 = new Country("Poland", new BigDecimal("14151452345"));
        Country country2 = new Country("Czech Republic", new BigDecimal("154645665"));
        Country country3 = new Country("Korea", new BigDecimal("8543523235"));
        Country country4 = new Country("Sudan", new BigDecimal("121451235515"));
        Country country5 = new Country("New Zealand", new BigDecimal("143235235"));

        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");
        Continent continent4 = new Continent("Australia");

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country3);
        continent3.addCountry(country4);
        continent4.addCountry(country5);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        //Then
        assertEquals(peopleQuantity, new BigDecimal("144444091995"));
    }
}
