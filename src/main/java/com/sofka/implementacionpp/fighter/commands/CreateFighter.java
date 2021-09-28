package com.sofka.implementacionpp.fighter.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fighter.Coach;
import com.sofka.implementacionpp.fighter.Nutritionist;
import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.fighter.values.FighterRecord;
import com.sofka.implementacionpp.fighter.values.Name;
import com.sofka.implementacionpp.fighter.values.Stats;

public class CreateFighter extends Command {
    private final FighterId entityId;
    private final Name name;
    private final Stats stats;
    private final FighterRecord record;
    private final Nutritionist nutritionist;
    private final Coach coach;

    public CreateFighter(FighterId entityId, Name name, Stats stats, FighterRecord record, Nutritionist nutritionist, Coach coach) {
        this.entityId = entityId;
        this.name = name;
        this.stats = stats;
        this.record = record;
        this.nutritionist = nutritionist;
        this.coach = coach;
    }

    public FighterId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Stats getStats() {
        return stats;
    }

    public FighterRecord getRecord() {
        return record;
    }

    public Nutritionist getNutritionist() {
        return nutritionist;
    }

    public Coach getCoach() {
        return coach;
    }
}
