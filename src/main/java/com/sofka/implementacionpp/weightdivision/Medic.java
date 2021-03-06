package com.sofka.implementacionpp.weightdivision;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionpp.weightdivision.values.MedicId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

import java.util.Objects;

public class Medic extends Entity<MedicId> {
    private OfficialName name;

    public Medic(MedicId entityId, OfficialName name) {
        super(entityId);
        this.name = name;
    }

    public OfficialName getName() {
        return name;
    }

    public void setMedicName(OfficialName name) {
        this.name = Objects.requireNonNull(name);
    }
}
