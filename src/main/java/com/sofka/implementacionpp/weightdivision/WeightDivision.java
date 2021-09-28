package com.sofka.implementacionpp.weightdivision;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.weightdivision.events.*;
import com.sofka.implementacionpp.weightdivision.values.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeightDivision extends AggregateEvent<WeightDivisionId> {
    protected ArrayList<FighterId> fighters;
    protected Medic medic;
    protected Commissary commissary;
    protected DivisionDefinition division;
    protected DivisionRanking divisionRanking;

    public WeightDivision(WeightDivisionId entityId, ArrayList<FighterId> fighters, Medic medic, Commissary commissary, DivisionDefinition division, DivisionRanking divisionRanking) {
        super(entityId);
        appendChange(new CreatedDivision(fighters, medic, commissary, division, divisionRanking));
    }
    private WeightDivision(WeightDivisionId entityId){
        super(entityId);
        subscribe(new WeightDivisionChange(this));
    }

    public static WeightDivision from(WeightDivisionId entityId, List<DomainEvent> events){
        var weightDivision = new WeightDivision(entityId);
        events.forEach(weightDivision::applyEvent);
        return weightDivision;
    }

    public void addNewFighterToRanking(FighterId id){
        Objects.requireNonNull(id);

        appendChange(new AddedNewFighterToRanking(id)).apply();
    }

    public void revokeFighterFromRanking(FighterId id){
        Objects.requireNonNull(id);

        appendChange(new RevokedFighterFromRanking(id)).apply();
    }

    public void changeCommissaryName(CommissaryId id){
        Objects.requireNonNull(id);

        appendChange(new ChangedCommissaryName(id)).apply();
    }

    public void changeMedicName(MedicId id){
        Objects.requireNonNull(id);

        appendChange(new ChangedMedicName(id)).apply();
    }

    public void updateDivisionRanking(DivisionRanking ranking){
        Objects.requireNonNull(ranking);

        appendChange(new UpdatedDivisionRanking(ranking)).apply();
    }





}
