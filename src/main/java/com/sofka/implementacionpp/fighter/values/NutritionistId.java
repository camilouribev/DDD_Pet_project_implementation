package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.Identity;

public class NutritionistId extends Identity {
    public NutritionistId(){

    }
    private NutritionistId(String id){
        super(id);
    }
    public static NutritionistId of(String id){
        return new NutritionistId(id);
    }
}
