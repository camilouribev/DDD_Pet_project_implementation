package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.Objects;


public class FighterRecord implements ValueObject<ArrayList<String>> {
    private final String wins;
    private final String draws;
    private final String losses;
    private final String kos;

    public FighterRecord(String wins, String draws, String losses, String kos) {
        this.wins = Objects.requireNonNull(wins);
        this.draws =Objects.requireNonNull(draws);
        this.losses = Objects.requireNonNull(losses);
        this.kos = Objects.requireNonNull(kos);
    }

    public String getWins() {
        return wins;
    }

    public String getDraws() {
        return draws;
    }

    public String getLosses() {
        return losses;
    }

    public String getKos() {
        return kos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FighterRecord that = (FighterRecord) o;
        return Objects.equals(getWins(), that.getWins()) && Objects.equals(getDraws(), that.getDraws()) && Objects.equals(getLosses(), that.getLosses()) && Objects.equals(getKos(), that.getKos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWins(), getDraws(), getLosses(), getKos());
    }

    @Override
    public ArrayList<String> value() {
        ArrayList<String> fighterRecord = new ArrayList<>();
        fighterRecord.add(this.getWins());
        fighterRecord.add(this.getDraws());
        fighterRecord.add(this.getLosses());
        fighterRecord.add(this.getKos());
        return fighterRecord;
    }
}
