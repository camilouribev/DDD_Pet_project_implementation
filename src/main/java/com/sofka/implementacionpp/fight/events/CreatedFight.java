package com.sofka.implementacionpp.fight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fight.Judge;
import com.sofka.implementacionpp.fight.Referee;
import com.sofka.implementacionpp.fight.values.FightId;
import com.sofka.implementacionpp.fight.values.Result;
import com.sofka.implementacionpp.fight.values.Venue;
import com.sofka.implementacionpp.fighter.values.FighterId;

import java.util.UUID;

public class CreatedFight extends DomainEvent {
    private final FightId fightId;
    private final FighterId fighter1;
    private final FighterId fighter2;
    private final Referee referee;
    private final Judge judge;
    private final Venue venue;
    private final Result result;

    public CreatedFight(FightId fightId, FighterId fighter1, FighterId fighter2, Referee referee, Judge judge, Venue venue, Result result) {
        super("sofka.fight.createdfight");
        this.fightId = fightId;
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.referee = referee;
        this.judge = judge;
        this.venue = venue;
        this.result = result;
    }

    public FightId getFightId() {
        return fightId;
    }

    public FighterId getFighter1() {
        return fighter1;
    }

    public FighterId getFighter2() {
        return fighter2;
    }

    public Referee getReferee() {
        return referee;
    }

    public Judge getJudge() {
        return judge;
    }

    public Venue getVenue() {
        return venue;
    }

    public Result getResult() {
        return result;
    }
}
