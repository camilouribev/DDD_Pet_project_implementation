package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.Objects;

public class Name implements ValueObject<ArrayList<String>> {
    private final String name;
    private final String nickname;

    public Name(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return name.equals(name1.name) && nickname.equals(name1.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickname);
    }

    @Override
    public ArrayList<String> value() {
        ArrayList<String> name = new ArrayList<>();
        name.add(this.getName());
        name.add(this.getNickname());

        return name;
    }
}
