package com.sofka.implementacionpp.fighter;


import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.fighter.values.Name;

public class Fighter extends AggregateEvent<FighterId> {

    public Fighter(FighterId entityId, Name name){

    }
}
