package com.github.kgrech.ducks;

import com.github.kgrech.ducks.strategy.move.MoveStrategy;
import com.github.kgrech.ducks.strategy.noise.NoiseStrategy;

public abstract class Duck implements Visual {

    private final MoveStrategy moveStrategy;
    private final NoiseStrategy noiseStrategy;

    protected Duck(MoveStrategy moveStrategy, NoiseStrategy noiseStrategy) {
        this.moveStrategy = moveStrategy;
        this.noiseStrategy = noiseStrategy;
    }

    public void live() {
        System.out.printf("The %s duck %s and make %s noise%n", look(),
                moveStrategy.move(this),
                noiseStrategy.sound(this));
    }

}
