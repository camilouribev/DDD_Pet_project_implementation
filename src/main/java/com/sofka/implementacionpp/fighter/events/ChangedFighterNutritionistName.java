package com.sofka.implementacionpp.fighter.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.NutritionistId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

public class ChangedFighterNutritionistName extends DomainEvent {

    private final NutritionistId id;
    private final OfficialName name;
    public ChangedFighterNutritionistName(NutritionistId id, OfficialName name){
        super("sofka.fighter.changedfighternutritionistname");

        this.id = id;
        this.name = name;

    }

    public NutritionistId getId() {
        return id;
    }

    public OfficialName getNutritionistName(){
        return name;
    }
}


