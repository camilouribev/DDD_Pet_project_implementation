package com.sofka.implementacionpp.weightdivision.values;

import co.com.sofka.domain.generic.Identity;
import com.sofka.implementacionpp.fighter.values.CoachId;

public class CommissaryId extends Identity {
    public CommissaryId(){

    }
    private CommissaryId(String id){
        super(id);
    }
    public static CommissaryId of(String id){
        return new CommissaryId(id);
    }
}
