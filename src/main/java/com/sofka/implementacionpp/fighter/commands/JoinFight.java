package com.sofka.implementacionpp.fighter.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.fighter.values.Name;

public class JoinFight extends Command {
    private final FighterId fighterId;
    private final  Name name;

    public JoinFight(FighterId fighterId, Name name) {
        this.fighterId = fighterId;
        this.name = name;
    }

    public FighterId getFighterId() {
        return fighterId;
    }

    public Name getName() {
        return name;
    }
}
