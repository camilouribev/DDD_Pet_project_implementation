package com.sofka.implementacionpp.fighter.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fighter.values.FighterId;
import com.sofka.implementacionpp.fighter.values.Stats;

public class ChangeFighterStats extends Command {
    FighterId id;
    Stats stats;

    public ChangeFighterStats(FighterId id, Stats stats) {
        this.id = id;
        this.stats = stats;
    }

    public FighterId getId() {
        return id;
    }

    public Stats getStats() {
        return stats;
    }
}
