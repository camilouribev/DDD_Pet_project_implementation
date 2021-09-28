package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.Identity;
import com.sofka.implementacionpp.fighter.Coach;

public class CoachId extends Identity {

    public CoachId(){

    }
    private CoachId(String id){
        super(id);
    }
    public static CoachId of(String id){
        return new CoachId(id);
    }
}
