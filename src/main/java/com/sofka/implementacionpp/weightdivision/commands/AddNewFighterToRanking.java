package com.sofka.implementacionpp.weightdivision.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fighter.values.FighterId;

public class AddNewFighterToRanking extends Command {
    private final FighterId id;

    public AddNewFighterToRanking(FighterId id) {
        this.id = id;
    }

    public FighterId getId() {
        return id;
    }
}
