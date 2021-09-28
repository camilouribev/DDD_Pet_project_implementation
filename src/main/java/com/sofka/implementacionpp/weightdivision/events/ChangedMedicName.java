package com.sofka.implementacionpp.weightdivision.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.weightdivision.Medic;
import com.sofka.implementacionpp.weightdivision.values.CommissaryId;
import com.sofka.implementacionpp.weightdivision.values.MedicId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

public class ChangedMedicName extends DomainEvent {
    private final MedicId id;
    private final OfficialName name;

    public ChangedMedicName(MedicId id, OfficialName name) {
        super("sofka.weightdivision.changedmedicname");
        this.id = id;
        this.name = name;
    }

    public MedicId getId() {
        return id;
    }

    public OfficialName getMedicName() {
        return name;
    }
}
