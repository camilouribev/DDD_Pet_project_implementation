package com.sofka.implementacionpp.weightdivision.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.FighterId;

public class AddedNewFighterToRanking extends DomainEvent {
private final FighterId id;

    public AddedNewFighterToRanking( FighterId id) {
        super("sofka.weightdivision.addednewfightertoranking");
        this.id = id;
    }

    public FighterId getId() {
        return id;
    }
}
