package com.sofka.implementacionpp.fighter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.FighterRecord;

public class UpdatedFighterRecord extends DomainEvent {
    private final FighterRecord record;

    public UpdatedFighterRecord(FighterRecord record){
        super("sofka.fighter.updatedfighterrecord");
        this.record = record;

    }

    public FighterRecord getRecord() {
        return record;
    }
}
