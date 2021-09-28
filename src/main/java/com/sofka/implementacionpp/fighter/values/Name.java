package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.implementacionpp.weightdivision.values.DivisionDefinition;
import org.hibernate.engine.spi.VersionValue;

import java.util.ArrayList;
import java.util.Objects;

public class Name implements ValueObject<Name.Props>{
    private final String name;
    private final String nickname;

    public Name(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;

        if(this.name.isBlank() || this.nickname.isBlank()){
            throw new IllegalAccessException("Name and lastName must not be empty")

        }
    }

    @Override
    public Props value() {
        return new Props(){
            @Override
            public String name(){return name;}
            @Override
            public String nickname(){return nickname;}
        };
    }

    public interface Props{
        String name();
        String nickname();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name) && Objects.equals(nickname, name1.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickname);
    }
}
