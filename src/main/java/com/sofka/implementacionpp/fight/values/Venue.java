package com.sofka.implementacionpp.fight.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Venue implements ValueObject<Venue.Props> {
    private final String building;
    private final String city;

    public Venue(String building, String city) {
        this.building = Objects.requireNonNull(building) ;
        this.city = Objects.requireNonNull(city);
    }

    public Props value() {
        return new Props() {
            @Override
            public String building() {
                return building;
            }

            @Override
            public String city() {
                return city;
            }
        };
    }

    public interface Props{
        String building();
        String city();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venue venue = (Venue) o;
        return Objects.equals(building, venue.building) && Objects.equals(city, venue.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(building, city);
    }
}
