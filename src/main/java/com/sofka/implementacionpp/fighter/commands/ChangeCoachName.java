package com.sofka.implementacionpp.fighter.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fighter.values.CoachId;
import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.fighter.values.Name;

public class ChangeCoachName extends Command {
    private final FighterId fighterId;
    private final CoachId id;
    private final Name name;

    public ChangeCoachName(FighterId fighterId, CoachId id, Name name) {
        this.fighterId = fighterId;
        this.id = id;
        this.name = name;
    }

    public FighterId getFighterId() {
        return fighterId;
    }

    public CoachId getId() {
        return id;
    }

    public Name getName() {
        return name;
    }
}
