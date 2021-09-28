package com.sofka.implementacionpp.fight;
import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionpp.fight.events.*;



public class FightChange extends EventChange {

    public FightChange(Fight fight) {
        apply((ChangedJudgeName event) -> {
            fight.judge.changeJudgeName(event.getJudgeName());
        });

        apply((ChangedRefereeName event) -> {
            fight.referee.changeRefereeName(event.getRefereeName());
        });
        apply((ChangedResult event) -> {
            fight.result= event.getResult();
        });
        apply((ChangedVenue event) -> {
            fight.venue= event.getVenue();
        });

        apply((CreatedFight event) -> {
            fight.fighter1 = event.getFighter1();
            fight.fighter2 = event.getFighter2();
            fight.referee = event.getReferee();
            fight.judge = event.getJudge();
            fight.venue = event.getVenue();
            fight.result = event.getResult();

        });


    }
}
