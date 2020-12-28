package com.github.kgrech.ducks;

import com.github.kgrech.ducks.strategy.MoveStrategy;
import com.github.kgrech.ducks.strategy.NoiseStrategy;

public class Duck {

    private final DuckType duckType;
    private final MoveStrategy moveStrategy;
    private final NoiseStrategy noiseStrategy;

    public Duck(DuckType duckType, MoveStrategy moveStrategy, NoiseStrategy noiseStrategy) {
        this.duckType = duckType;
        this.moveStrategy = moveStrategy;
        this.noiseStrategy = noiseStrategy;
    }

    public void live() {
        System.out.printf("The %s duck %s and makes %s noise\n",
                duckType.look(),
                moveStrategy.move(this),
                noiseStrategy.sound(this));
    }

}
