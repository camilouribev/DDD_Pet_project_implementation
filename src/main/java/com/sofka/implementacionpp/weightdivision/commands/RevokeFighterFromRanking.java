package com.sofka.implementacionpp.weightdivision.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fighter.values.FighterId;

public class RevokeFighterFromRanking extends Command {
    FighterId id;

    public RevokeFighterFromRanking(FighterId id) {
        this.id = id;
    }

    public FighterId getId() {
        return id;
    }
}
