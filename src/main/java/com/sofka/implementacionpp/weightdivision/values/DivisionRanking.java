package com.sofka.implementacionpp.weightdivision.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.implementacionpp.fighter.values.FighterId;

import java.util.List;
import java.util.Objects;

public class DivisionRanking implements ValueObject<DivisionRanking.Props> {
    private final String rankingDate;
    private final List<FighterId> ranking;

    public DivisionRanking(String rankingDate, List<FighterId> ranking) {
        this.rankingDate = rankingDate;
        this.ranking = ranking;
    }

    @Override
    public Props value() {
        return new Props(){
            @Override
            public String rankingDate(){return rankingDate;}
            @Override
            public List<FighterId> ranking(){return ranking;}

        };
    }


    public interface Props{
        String rankingDate();
        double ranking();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DivisionRanking that = (DivisionRanking) o;
        return Objects.equals(rankingDate, that.rankingDate) && Objects.equals(ranking, that.ranking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rankingDate, ranking);
    }
}
