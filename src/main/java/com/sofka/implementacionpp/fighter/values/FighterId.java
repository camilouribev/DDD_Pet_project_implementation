package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.Identity;

public class FighterId extends Identity {
    public FighterId(){

    }
    private FighterId(String id){
        super(id);
    }
    public static FighterId of(String id){
        return new FighterId(id);
    }
}
