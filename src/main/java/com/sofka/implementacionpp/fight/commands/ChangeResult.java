package com.sofka.implementacionpp.fight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fight.values.Result;

public class ChangeResult extends Command {
    Result result;

    public ChangeResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }
}
