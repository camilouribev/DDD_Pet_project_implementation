package com.sofka.implementacionpp.weightdivision.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.weightdivision.values.CommissaryId;

public class ChangeCommissaryName extends Command {
    CommissaryId id;

    public ChangeCommissaryName(CommissaryId id) {
        this.id = id;
    }

    public CommissaryId getId() {
        return id;
    }
}
