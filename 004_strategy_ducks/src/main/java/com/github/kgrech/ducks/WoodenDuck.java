package com.github.kgrech.ducks;

import com.github.kgrech.ducks.strategy.move.SwimStrategy;
import com.github.kgrech.ducks.strategy.noise.SilentStrategy;

public class WoodenDuck extends Duck {

    public WoodenDuck() {
        super(new SwimStrategy(), new SilentStrategy());
    }

    @Override
    public String look() {
        return "Wooden";
    }

}
