package com.sofka.implementacionpp.fighter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.Coach;
import com.sofka.implementacionpp.fighter.Nutritionist;
import com.sofka.implementacionpp.fighter.values.FighterRecord;
import com.sofka.implementacionpp.fighter.values.Name;
import com.sofka.implementacionpp.fighter.values.Stats;

public class CreatedFighter extends DomainEvent {
    private final Name name;
    private final Stats stats;
    private final FighterRecord fighterRecord;
    private final Coach coach;
    private final Nutritionist nutritionist;

    public CreatedFighter(Name name, Stats stats, FighterRecord record, Coach coach, Nutritionist nutritionist) {
        super("sofka.fighter.createdfighter");
        this.name = name;
        this.stats = stats;
        this.fighterRecord = record;
        this.coach = coach;
        this.nutritionist= nutritionist;
    }

    public Name getName() {
        return name;
    }

    public Stats getStats() {
        return stats;
    }

    public FighterRecord getFighterRecord() {
        return fighterRecord;
    }

    public Coach getCoach() {
        return coach;
    }

    public Nutritionist getNutritionist() {
        return nutritionist;
    }
}
