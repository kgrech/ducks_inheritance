package com.github.kgrech.ducks;

import com.github.kgrech.ducks.strategy.move.FlyStrategy;
import com.github.kgrech.ducks.strategy.noise.QuackStrategy;

public class GreyDuck extends Duck {

    public GreyDuck() {
        super(new FlyStrategy(), new QuackStrategy());
    }

    @Override
    public String look() {
        return "Grey";
    }
}
