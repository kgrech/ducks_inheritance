package com.github.kgrech.ducks;

import com.github.kgrech.ducks.strategy.move.FlyStrategy;
import com.github.kgrech.ducks.strategy.noise.QuackStrategy;

public class BrownDuck extends Duck {

    public BrownDuck() {
        super(new FlyStrategy(), new QuackStrategy());
    }

    @Override
    public String look() {
        return "Brown";
    }
}
