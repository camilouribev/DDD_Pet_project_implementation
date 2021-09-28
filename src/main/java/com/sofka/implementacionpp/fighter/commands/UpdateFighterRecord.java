package com.sofka.implementacionpp.fighter.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.fighter.values.FighterRecord;

public class UpdateFighterRecord extends Command {
    FighterId id;
    FighterRecord record;

    public UpdateFighterRecord(FighterId id, FighterRecord record) {
        this.id = id;
        this.record = record;
    }

    public FighterId getId() {
        return id;
    }

    public FighterRecord getRecord() {
        return record;
    }
}
