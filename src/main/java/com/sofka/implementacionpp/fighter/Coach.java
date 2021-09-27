package com.sofka.implementacionpp.fighter;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionpp.fighter.values.CoachId;
import com.sofka.implementacionpp.fighter.values.Name;

import java.util.Objects;

public class Coach extends Entity<CoachId> {
    private Name name;
    private String style;

    public Coach(CoachId entityId, Name name, String style) {
        super(entityId);
        this.name = name;
        this.style = style;

    }

    public void changeName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public Name getCoachName() {
        return name;
    }

    public String getCoachStyle() {
        return style;
    }
}
