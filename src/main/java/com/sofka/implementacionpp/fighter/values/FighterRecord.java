package com.sofka.implementacionpp.fighter.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;


public class FighterRecord implements  ValueObject<FighterRecord.Props>{
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

    @Override
    public Props value() {
        return new Props(){
            @Override
            public String wins(){return wins;}
            @Override
            public String draws(){return draws;}
            @Override
            public String losses(){return losses;}
            @Override
            public String kos(){return kos;}

        };
    }

    public interface Props{
        String wins();
        String draws();
        String height();
        String losses();
        String kos();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FighterRecord that = (FighterRecord) o;
        return Objects.equals(wins, that.wins) && Objects.equals(draws, that.draws) && Objects.equals(losses, that.losses) && Objects.equals(kos, that.kos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wins, draws, losses, kos);
    }
}
