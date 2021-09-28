package com.sofka.implementacionpp.fighter;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.events.*;
import com.sofka.implementacionpp.fighter.values.*;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

import java.util.List;
import java.util.Objects;

public class Fighter extends AggregateEvent<FighterId> {
    protected Name name;
    protected Coach coach;
    protected Nutritionist nutritionist;
    protected Stats stats;
    protected FighterRecord fighterRecord;
    protected boolean isInjured = false;


    public Fighter(FighterId entityId, Name name, Stats stats, FighterRecord record, Nutritionist nutritionist, Coach coach){
        super(entityId);
        appendChange(new CreatedFighter(name, stats, record, coach, nutritionist)).apply();
    }

    private Fighter(FighterId entityId){
        super(entityId);
        subscribe(new FighterChange(this));

    }

    public static Fighter from(FighterId entityId, List<DomainEvent> events){
        var fighter = new Fighter(entityId);
        events.forEach(fighter::applyEvent);
        return fighter;
    }

    public void joinFight(Name name){
        Objects.requireNonNull(name);
        appendChange(new FighterJoinedFight(name)).apply();

    }

    public void changeCoachName(CoachId id, Name name){
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);

        appendChange(new ChangedFighterCoachName(id, name)).apply();
    }

    public void changeNutritionistName(NutritionistId id, OfficialName name){
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        appendChange(new ChangedFighterNutritionistName(id, name)).apply();
    }

    public void changeFighterStats(Stats stats){
        Objects.requireNonNull(stats);
        appendChange(new ChangedFighterStats(stats)).apply();
    }

    public void updateFighterRecord(FighterRecord record){
        Objects.requireNonNull(record);
        appendChange(new UpdatedFighterRecord(record)).apply();
    }




}
