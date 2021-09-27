package com.sofka.implementacionpp.fighter;

import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionpp.fighter.values.NutritionistId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

import java.util.Objects;

public class Nutritionist extends Entity<NutritionistId> {
    private OfficialName name;

    public Nutritionist(NutritionistId id, OfficialName name){
        super(id);
        this.name = name;

    }

    public OfficialName getName() {
        return name;
    }

    public void changeName(OfficialName name) {
        this.name = Objects.requireNonNull(name);
    }
}
