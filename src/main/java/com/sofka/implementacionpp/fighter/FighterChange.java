package com.sofka.implementacionpp.fighter;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionpp.fighter.events.*;

public class FighterChange extends EventChange {
    public FighterChange(Fighter fighter){
        apply((FighterJoinedFight event) ->{
            fighter.name = event.getName();

        });

        apply((CreatedFighter event) ->{
            fighter.name = event.getName();
            fighter.fighterRecord= event.getFighterRecord();
            fighter.coach = event.getCoach();
            fighter.nutritionist = event.getNutritionist();
        });

        apply((ChangedFighterStats event)->{
            fighter.stats = event.getStats();
        });

        apply((ChangedFighterNutritionistName event)->{
            fighter.nutritionist.changeName(event.getNutritionistName());
        });

        apply((ChangedFighterCoachName event)->{
            fighter.coach.changeName(event.getCoachName());
        });

        apply((UpdatedFighterRecord event)->{
            fighter.fighterRecord = event.getRecord();
        });
    }
}
