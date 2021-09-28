package com.sofka.implementacionpp.fight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fight.values.RefereeId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

public class ChangeRefereeName extends Command {
    RefereeId id;
    OfficialName name;

    public ChangeRefereeName(RefereeId id, OfficialName name) {
        this.id = id;
        this.name = name;
    }

    public RefereeId getId() {
        return id;
    }

    public OfficialName getName() {
        return name;
    }
}
