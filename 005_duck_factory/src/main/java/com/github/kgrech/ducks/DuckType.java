package com.github.kgrech.ducks;

import com.github.kgrech.ducks.strategy.MoveStrategy;
import com.github.kgrech.ducks.strategy.NoiseStrategy;

import static com.github.kgrech.ducks.strategy.MoveStrategy.FlyStrategy;
import static com.github.kgrech.ducks.strategy.MoveStrategy.SwimStrategy;
import static com.github.kgrech.ducks.strategy.NoiseStrategy.QuackStrategy;
import static com.github.kgrech.ducks.strategy.NoiseStrategy.SilentStrategy;

public enum DuckType implements Visual {

    BrownDuck("brown", FlyStrategy, QuackStrategy),
    GreyDuck("grey", FlyStrategy, QuackStrategy),
    PlasticDuck("plastic", SwimStrategy, SilentStrategy),
    WoodenDuck("wooden", SwimStrategy, SilentStrategy),
    RubberDuck("rubber", SwimStrategy, QuackStrategy);

    private final String look;
    private final MoveStrategy moveStrategy;
    private final NoiseStrategy noiseStrategy;

    DuckType(String look, MoveStrategy moveStrategy, NoiseStrategy noiseStrategy) {
        this.look = look;
        this.moveStrategy = moveStrategy;
        this.noiseStrategy = noiseStrategy;
    }

    @Override
    public String look() {
        return look;
    }

    public Duck create() {
        return new Duck(this, moveStrategy, noiseStrategy);
    }
}
