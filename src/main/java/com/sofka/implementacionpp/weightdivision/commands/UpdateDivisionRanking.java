package com.sofka.implementacionpp.weightdivision.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.weightdivision.values.DivisionRanking;

public class UpdateDivisionRanking extends Command {
    DivisionRanking ranking;

    public UpdateDivisionRanking(DivisionRanking ranking) {
        this.ranking = ranking;
    }

    public DivisionRanking getRanking() {
        return ranking;
    }
}
