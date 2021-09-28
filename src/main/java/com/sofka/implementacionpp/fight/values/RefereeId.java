package com.sofka.implementacionpp.fight.values;

import co.com.sofka.domain.generic.Identity;

public class RefereeId extends Identity {
    public RefereeId(){

    }
    private RefereeId(String id){
        super(id);
    }
    public static RefereeId of(String id){
        return new RefereeId(id);
    }
}
