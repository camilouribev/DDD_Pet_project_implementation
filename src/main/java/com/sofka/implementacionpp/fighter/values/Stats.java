package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.Objects;

public class Stats implements ValueObject<ArrayList<String>> {
    private final String hometown;
    private final String style;
    private final String height;
    private final String weight;
    private final String reach;

    public Stats(String hometown, String style, String height, String weight, String reach) {
        this.hometown = hometown;
        this.style = style;
        this.height = height;
        this.weight = weight;
        this.reach = reach;
    }

    public String getHometown() {
        return hometown;
    }

    public String getStyle() {
        return style;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getReach() {
        return reach;
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

    @Override
    public ArrayList<String> value() {
        ArrayList<String> stats = new ArrayList<>();
        stats.add(this.getHometown());
        stats.add(this.getStyle());
        stats.add(this.getHeight());
        stats.add(this.getWeight());
        stats.add(this.getReach());


        return stats;    }
}
