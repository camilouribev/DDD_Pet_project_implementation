package com.sofka.implementacionpp.fighter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.Stats;

public class ChangedFighterStats extends DomainEvent {
    private final Stats stats;

    public ChangedFighterStats(Stats stats){
        super("sofka.fighter.changedfighterstats");
        this.stats = stats;
    }

    public Stats getStats() {
        return stats;
    }
}
