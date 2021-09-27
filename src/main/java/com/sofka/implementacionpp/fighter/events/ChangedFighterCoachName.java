package com.sofka.implementacionpp.fighter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.CoachId;
import com.sofka.implementacionpp.fighter.values.Name;

public class ChangedFighterCoachName extends DomainEvent {
    private final CoachId id;
    private final Name name;

    public ChangedFighterCoachName(CoachId id, Name name){
        super("sofka.fighter.changedfightercoachname");
        this.id = id;
        this.name = name;

    }

    public CoachId getId() {
        return id;
    }


    public Name getCoachName() {
        return name;
    }
}
