package com.sofka.implementacionpp.fight;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionpp.fight.values.RefereeId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

import java.util.Objects;

public class Referee extends Entity<RefereeId> {
    private OfficialName name;

    public Referee(RefereeId entityId, OfficialName name) {
        super(entityId);
        this.name = name;
    }

    public void changeRefereeName(OfficialName name){this.name = Objects.requireNonNull(name)}

    public OfficialName getRefereeName() {
        return name;
    }
}
