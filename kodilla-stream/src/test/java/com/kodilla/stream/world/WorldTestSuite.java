package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void QuantityOfPeopleTest() {

        //Given
        World world = new World();

        Continent continent1 = new Continent("Azja");
        Continent continent2 = new Continent("Australia");
        Continent continent3 = new Continent("Europa");
        Continent continent4 = new Continent("AmerykaN");
        Continent continent5 = new Continent("Afryka");

        Country country1 = new Country("Indie", new BigDecimal("43546"));
        Country country2 = new Country("Korea", new BigDecimal("45667"));
        Country country3 = new Country("Nowa Zelandia", new BigDecimal("2334456"));
        Country country4 = new Country("Australia", new BigDecimal("2235667"));
        Country country5 = new Country("Francja", new BigDecimal("573827496"));
        Country country6 = new Country("Czechy", new BigDecimal("45638282"));
        Country country7 = new Country("USA", new BigDecimal("28173493"));
        Country country8 = new Country("Kanada", new BigDecimal("57493785"));
        Country country9 = new Country("Madagaskar", new BigDecimal("96850483"));
        Country country10 = new Country("RPA", new BigDecimal("90283455"));

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent3.addCountry(country5);
        continent3.addCountry(country6);
        continent4.addCountry(country7);
        continent4.addCountry(country8);
        continent5.addCountry(country9);
        continent5.addCountry(country10);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("896926330"), totalPeopleQuantity);
    }
}
