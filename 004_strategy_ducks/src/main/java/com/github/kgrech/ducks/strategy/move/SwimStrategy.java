package com.github.kgrech.ducks.strategy.move;

import com.github.kgrech.ducks.Duck;

public class SwimStrategy implements MoveStrategy{
    @Override
    public String move(Duck duck) {
        return "swims";
    }
}
