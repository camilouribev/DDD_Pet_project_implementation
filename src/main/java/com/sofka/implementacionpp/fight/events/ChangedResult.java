package com.sofka.implementacionpp.fight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fight.values.Result;

public class ChangedResult extends DomainEvent {
    private final Result result;

    public ChangedResult( Result result) {
        super("sofka.fight.changedresult");
        this.result = result;
    }

    public Result getResult() {
        return result;
    }
}
