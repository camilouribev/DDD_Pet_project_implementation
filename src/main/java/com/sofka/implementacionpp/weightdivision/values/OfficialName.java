package com.sofka.implementacionpp.weightdivision.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.implementacionpp.fighter.values.Name;

import java.util.Objects;

public class OfficialName implements ValueObject<OfficialName.Props> {
    private final String name;
    private final String lastName;

    public OfficialName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

        if(this.name.isBlank() || this.lastName.isBlank()){
            throw new IllegalAccessException("Name and lastName must not be empty")

        }
    }
    @Override
    public Props value() {
        return new Props(){
            @Override
            public String name(){return name;}
            @Override
            public String lastName(){return lastName;}
        };
    }

    public interface Props{
        String name();
        String lastName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficialName that = (OfficialName) o;
        return Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
