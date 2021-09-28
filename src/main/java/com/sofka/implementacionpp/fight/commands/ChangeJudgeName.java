package com.sofka.implementacionpp.fight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fight.Judge;
import com.sofka.implementacionpp.fight.values.JudgeId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

public class ChangeJudgeName extends Command {
    JudgeId id;
    OfficialName name;


    public ChangeJudgeName(JudgeId id, OfficialName name) {
        this.id = id;
        this.name = name;
    }

    public OfficialName getName() {
        return name;
    }

    public JudgeId getId() {
        return id;
    }
}
