package com.sofka.implementacionpp.weightdivision.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.weightdivision.Commissary;
import com.sofka.implementacionpp.weightdivision.Medic;
import com.sofka.implementacionpp.weightdivision.values.DivisionDefinition;
import com.sofka.implementacionpp.weightdivision.values.DivisionRanking;

import java.util.ArrayList;

public class CreatedDivision extends DomainEvent {
  private final ArrayList<FighterId> fighters;
  private final Medic medic;
  private final Commissary commissary;
  private final DivisionDefinition division;
  private final DivisionRanking divisionRanking;

    public CreatedDivision(ArrayList<FighterId> fighters, Medic medic, Commissary commissary, DivisionDefinition division, DivisionRanking divisionRanking) {
        super("sofka.weightdivision.createddivision");
        this.fighters = fighters;
        this.medic = medic;
        this.commissary = commissary;
        this.division = division;
        this.divisionRanking = divisionRanking;
    }

    public ArrayList<FighterId> getFighters() {
        return fighters;
    }

    public Medic getMedic() {
        return medic;
    }

    public Commissary getComissary() {
        return commissary;
    }

    public DivisionDefinition getDivision() {
        return division;
    }

    public DivisionRanking getDivisionRanking() {
        return divisionRanking;
    }
}
