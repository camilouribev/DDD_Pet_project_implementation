package com.sofka.implementacionpp.fight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fight.values.RefereeId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

public class ChangedRefereeName extends DomainEvent {
    private final RefereeId id;
    private final OfficialName name;

    public ChangedRefereeName( RefereeId id, OfficialName name) {
        super("sofka.fight.changedrefereename");
        this.id = id;
        this.name = name;
    }

    public RefereeId getId() {
        return id;
    }

    public OfficialName getRefereeName() {
        return name;
    }
}
