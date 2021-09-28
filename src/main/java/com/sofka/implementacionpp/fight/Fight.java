package com.sofka.implementacionpp.fight;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fight.events.*;
import com.sofka.implementacionpp.fight.values.*;

import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

import java.util.List;
import java.util.Objects;


public class Fight extends AggregateEvent<FightId> {

    protected FighterId fighter1;
    protected FighterId fighter2;
    protected Referee referee;
    protected Judge judge;
    protected Venue venue;
    protected Result result;

    public Fight(FightId entityId, FightId fightId, FighterId fighter1, FighterId fighter2, Referee referee, Judge judge, Venue venue, Result result) {
        super(entityId);
        appendChange(new CreatedFight(fightId, fighter1, fighter2, referee, judge, venue, result));
    }

    private Fight(FightId entityId){
        super(entityId);
        subscribe(new FightChange(this));
    }

    public static Fight from(FightId entityId, List<DomainEvent> events){
        var fight = new Fight(entityId);
        events.forEach(fight::applyEvent);
        return fight;
    }

    public void changeRefereeName(RefereeId id, OfficialName name){
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);

        appendChange(new ChangedRefereeName(id, name)).apply();
    }

    public void changeJudgeName(JudgeId id, OfficialName name){
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);

        appendChange(new ChangedJudgeName(id, name)).apply();
    }

    public void changeVenue(Venue venue){
        Objects.requireNonNull(venue);
        appendChange(new ChangedVenue(venue)).apply();
    }

    public void changeResult(Result result){
        Objects.requireNonNull(result);
        appendChange(new ChangedResult(result)).apply();
    }

    /*
    public void updateFighterRecords(FighterId idWinner, FighterId idLoser){
        Objects.requireNonNull(idWinner);
        Objects.requireNonNull(idLoser);

        appendChange(new UpdatedFighterRecords(idWinner, idLoser)).apply();
    }
*/






}
