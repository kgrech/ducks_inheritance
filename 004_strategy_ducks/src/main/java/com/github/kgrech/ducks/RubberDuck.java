package com.github.kgrech.ducks;

import com.github.kgrech.ducks.strategy.move.SwimStrategy;
import com.github.kgrech.ducks.strategy.noise.QuackStrategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new SwimStrategy(), new QuackStrategy());
    }

    @Override
    public String look() {
        return "Rubber";
    }
}
