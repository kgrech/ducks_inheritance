package com.github.kgrech.ducks.strategy.noise;

import com.github.kgrech.ducks.Duck;

public class QuackStrategy implements NoiseStrategy {
    @Override
    public String sound(Duck duck) {
        return "quack";
    }
}
