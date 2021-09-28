package com.sofka.implementacionpp.fighter.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fighter.values.NutritionistId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

public class ChangeNutritionistName extends Command {

    NutritionistId id;
    OfficialName name;

    public ChangeNutritionistName(NutritionistId id, OfficialName name) {
        this.id = id;
        this.name = name;
    }

    public NutritionistId getId() {
        return id;
    }

    public OfficialName getName() {
        return name;
    }
}
