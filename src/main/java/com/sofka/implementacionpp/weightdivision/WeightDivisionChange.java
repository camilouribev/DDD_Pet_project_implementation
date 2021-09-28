package com.sofka.implementacionpp.weightdivision;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.implementacionpp.weightdivision.events.*;

public class WeightDivisionChange extends EventChange {
    public WeightDivisionChange(WeightDivision weightDivision){
        apply((AddedNewFighterToRanking event) -> {
            weightDivision.fighters.add(event.getId());
        });

        apply((ChangedCommissaryName event) -> {
            weightDivision.commissary.setCommissaryName(event.getCommissaryName());
        });

        apply((ChangedMedicName event) -> {
            weightDivision.medic.setMedicName(event.getMedicName());
        });

        apply((CreatedDivision event) -> {
            weightDivision.fighters = event.getFighters();
            weightDivision.medic =event.getMedic();
            weightDivision.commissary = event.getComissary();
            weightDivision.division = event.getDivision();
            weightDivision.divisionRanking = event.getDivisionRanking();
        });

        apply((RevokedFighterFromRanking event) -> {
            weightDivision.fighters.remove(event.getId());
        });

        apply((UpdatedDivisionRanking event) -> {
            weightDivision.divisionRanking = event.getRanking();
        });



    }
}
