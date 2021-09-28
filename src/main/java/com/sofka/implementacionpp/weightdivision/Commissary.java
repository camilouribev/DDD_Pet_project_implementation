package com.sofka.implementacionpp.weightdivision;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionpp.weightdivision.values.CommissaryId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

import java.util.Objects;

public class Commissary extends Entity<CommissaryId> {
    private OfficialName name;

    public Commissary(CommissaryId entityId, OfficialName name) {
        super(entityId);
        this.name = name;
    }

    public OfficialName getName() {
        return name;
    }

    public void setCommissaryName(OfficialName name) {
        this.name = Objects.requireNonNull(name);
    }
}
