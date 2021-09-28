package com.sofka.implementacionpp.weightdivision.values;

import co.com.sofka.domain.generic.Identity;

public class MedicId extends Identity {
    public MedicId(){

    }
    private MedicId(String id){
        super(id);
    }
    public static MedicId of(String id){
        return new MedicId(id);
    }
}
