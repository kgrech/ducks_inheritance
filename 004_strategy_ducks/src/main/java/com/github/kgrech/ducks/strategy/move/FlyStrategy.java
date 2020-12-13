package com.github.kgrech.ducks.strategy.move;

import com.github.kgrech.ducks.Duck;

public class FlyStrategy implements MoveStrategy{
    @Override
    public String move(Duck duck) {
        return "flies";
    }
}
