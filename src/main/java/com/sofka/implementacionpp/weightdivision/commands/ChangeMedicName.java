package com.sofka.implementacionpp.weightdivision.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.weightdivision.values.MedicId;

public class ChangeMedicName extends Command {
    MedicId id;

    public ChangeMedicName(MedicId id) {
        this.id = id;
    }

    public MedicId getId() {
        return id;
    }
}
