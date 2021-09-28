package com.sofka.implementacionpp.fight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.implementacionpp.fight.values.Venue;

public class ChangedVenue extends DomainEvent {
    private final Venue venue;

    public ChangedVenue( Venue venue) {
        super("sofka.fight.changedvenue");
        this.venue = venue;
    }

    public Venue getVenue() {
        return venue;
    }
}
