package com.sofka.implementacionpp.fight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fight.values.JudgeId;
import com.sofka.implementacionpp.weightdivision.values.OfficialName;

public class ChangedJudgeName extends DomainEvent {
    private final JudgeId id;
    private final OfficialName name;

    public ChangedJudgeName(JudgeId id, OfficialName name) {
        super("sofka.fight.changedjudgename");
        this.id = id;
        this.name = name;
    }

    public JudgeId getId() {
        return id;
    }

    public OfficialName getJudgeName() {
        return name;
    }
}
