package com.sofka.implementacionpp.fight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.implementacionpp.fight.values.Venue;

public class ChangeVenue extends Command {
    Venue venue;

    public ChangeVenue(Venue venue) {
        this.venue = venue;
    }

    public Venue getVenue() {
        return venue;
    }
}
