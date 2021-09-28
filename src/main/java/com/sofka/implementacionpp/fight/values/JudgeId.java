package com.sofka.implementacionpp.fight.values;

import co.com.sofka.domain.generic.Identity;

public class JudgeId extends Identity {
    public JudgeId(){

    }
    private JudgeId(String id){
        super(id);
    }
    public static JudgeId of(String id){
        return new JudgeId(id);
    }
}
