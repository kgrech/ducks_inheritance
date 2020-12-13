package com.github.kgrech.ducks;

import com.github.kgrech.ducks.strategy.move.SwimStrategy;
import com.github.kgrech.ducks.strategy.noise.SilentStrategy;

public class PlasticDuck extends Duck {

    public PlasticDuck() {
        super(new SwimStrategy(), new SilentStrategy());
    }

    @Override
    public String look() {
        return "Plastic";
    }
}
