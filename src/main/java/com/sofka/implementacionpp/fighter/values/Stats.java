package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Stats implements ValueObject<Stats.Props> {
    private final String hometown;
    private final String style;
    private final String height;
    private final String weight;
    private final String reach;

    public Stats(String hometown, String style, String height, String weight, String reach) {
        this.hometown = Objects.requireNonNull(hometown);
        this.style = Objects.requireNonNull(style);
        this.height = Objects.requireNonNull(height);
        this.weight = Objects.requireNonNull(weight);
        this.reach = Objects.requireNonNull(reach);
    }

    @Override
    public Props value() {
        return new Props(){
            @Override
            public String hometown(){return hometown;}
            @Override
            public String style(){return style;}
            @Override
            public String height(){return height;}
            @Override
            public String weight(){return weight;}
            @Override
            public String reach(){return reach;}
        };
    }

    public interface Props{
        String hometown();
        String style();
        String height();
        String weight();
        String reach();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return Objects.equals(hometown, stats.hometown) && Objects.equals(style, stats.style) && Objects.equals(height, stats.height) && Objects.equals(weight, stats.weight) && Objects.equals(reach, stats.reach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hometown, style, height, weight, reach);
    }
}
