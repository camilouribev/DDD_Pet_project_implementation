package com.sofka.implementacionpp.fighter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.Name;

public class FighterJoinedFight extends DomainEvent {
    private final Name name;

    public FighterJoinedFight(Name name) {
        super("sofka.fighter.joinedfight");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
