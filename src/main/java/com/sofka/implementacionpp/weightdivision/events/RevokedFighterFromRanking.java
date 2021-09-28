package com.sofka.implementacionpp.weightdivision.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.FighterId;

public class RevokedFighterFromRanking extends DomainEvent {
    private final FighterId id;

    public RevokedFighterFromRanking( FighterId id) {
        super("sofka.weightdivision.revokedfighterfromranking");
        this.id = id;
    }

    public FighterId getId() {
        return id;
    }
}
