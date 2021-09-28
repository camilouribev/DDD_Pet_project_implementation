package com.sofka.implementacionpp.fight.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.implementacionpp.fighter.values.FighterId;

import java.util.Objects;

public class Result implements ValueObject<Result.Props> {
    private final FighterId winner;
    private final boolean finishedWithKo;

    public Result(FighterId winner, boolean finishedWithKo) {
        this.winner = Objects.requireNonNull(winner) ;
        this.finishedWithKo = finishedWithKo;
    }

    public Props value() {
        return new Props(){
            @Override
            public FighterId winner(){return winner;}
            @Override
            public boolean finishedWithKo(){return finishedWithKo;}
        };

    }

    public interface Props{
        FighterId winner();
        boolean finishedWithKo();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return finishedWithKo == result.finishedWithKo && Objects.equals(winner, result.winner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winner, finishedWithKo);
    }
}
