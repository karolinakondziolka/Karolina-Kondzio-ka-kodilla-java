package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final String continentName;
    private final Set<Country> countries = new HashSet<>();


    public Continent(String continentName) {

        this.continentName = continentName;
    }

    public String getContinentName() {

        return continentName;
    }

    public Set<Country> getCountries() {

        return countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (!continentName.equals(continent.continentName)) return false;
        return countries.equals(continent.countries);
    }

    @Override
    public int hashCode() {
        int result = continentName.hashCode();
        result = 31 * result + countries.hashCode();
        return result;
    }
}
