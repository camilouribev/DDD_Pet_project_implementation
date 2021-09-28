package com.sofka.implementacionpp.fight;


import co.com.sofka.domain.generic.Entity;
import com.sofka.implementacionpp.fight.values.JudgeId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

import java.util.Objects;

public class Judge extends Entity<JudgeId> {
    private OfficialName name;

    public Judge(JudgeId entityId, OfficialName name) {
        super(entityId);
        this.name = name;
    }

    public void changeJudgeName(OfficialName name){this.name = Objects.requireNonNull(name)}

    public OfficialName getJudgeName() {
        return name;
    }
}
