package com.sofka.implementacionpp.fight.values;

import co.com.sofka.domain.generic.Identity;

public class FightId extends Identity {
    public FightId(){

    }
    private FightId(String id){
        super(id);
    }
    public static FightId of(String id){
        return new FightId(id);
    }
}
