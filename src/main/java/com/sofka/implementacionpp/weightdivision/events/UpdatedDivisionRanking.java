package com.sofka.implementacionpp.weightdivision.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.weightdivision.values.DivisionRanking;

public class UpdatedDivisionRanking extends DomainEvent {
    private final DivisionRanking ranking;

    public UpdatedDivisionRanking(DivisionRanking ranking) {
        super("sofka.weightdivision.updateddivisionranking");
        this.ranking = ranking;
    }

    public DivisionRanking getRanking() {
        return ranking;
    }
}
