package com.sofka.implementacionpp.weightdivision.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.weightdivision.values.CommissaryId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

public class ChangedCommissaryName extends DomainEvent {
    private final CommissaryId id;
    private final OfficialName name;

    public ChangedCommissaryName( CommissaryId id, OfficialName name) {
        super("sofka.weightdivision.changedcommissaryname");
        this.id = id;
        this.name = name;
    }

    public CommissaryId getId() {
        return id;
    }

    public OfficialName getCommissaryName() {
        return name;
    }
}
