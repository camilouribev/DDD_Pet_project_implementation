package com.sofka.implementacionpp.weightdivision.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DivisionDefinition implements ValueObject<DivisionDefinition.Props> {
    private final String divisionName;
    private final double divisionMaxWeight;
    private final double divisionMinWeight;

    public DivisionDefinition(String divisionName, double divisionMaxWeight, double divisionMinWeight) {
        this.divisionName = divisionName;
        this.divisionMaxWeight = divisionMaxWeight;
        this.divisionMinWeight = divisionMinWeight;

    }

        @Override
        public Props value() {
            return new Props(){
                @Override
                public String divisionName(){return divisionName;}
                @Override
                public double divisionMaxWeight(){return divisionMaxWeight;}
                @Override
                public double divisionMinWeight(){return divisionMinWeight;}
            };
        }

        public interface Props{
            String divisionName();
            double divisionMaxWeight();
            double divisionMinWeight();
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DivisionDefinition that = (DivisionDefinition) o;
        return Double.compare(that.divisionMaxWeight, divisionMaxWeight) == 0 && Double.compare(that.divisionMinWeight, divisionMinWeight) == 0 && Objects.equals(divisionName, that.divisionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(divisionName, divisionMaxWeight, divisionMinWeight);
    }
}

