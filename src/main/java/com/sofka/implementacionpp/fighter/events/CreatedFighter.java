package com.sofka.implementacionpp.fighter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.Name;
import com.sofka.implementacionpp.fighter.values.Stats;

public class CreatedFighter extends DomainEvent {
    private final Name name;
    private final Stats stats;

    public CreatedFighter(Name name, Stats stats) {
        super("sofka.fighter.createdfighter");
        this.name = name;
        this.stats = stats;
    }

    public Name getName() {
        return name;
    }

    public Stats getStats(){
        return stats;
    }
}
