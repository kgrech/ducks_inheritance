package com.github.kgrech.ducks.strategy;

import com.github.kgrech.ducks.Duck;

public enum NoiseStrategy {
    QuackStrategy {
        @Override
        public String sound(Duck duck) {
            return "quack";
        }
    },
    SilentStrategy {
        @Override
        public String sound(Duck duck) {
            return "no";
        }
    };

    public abstract String sound(Duck duck);
}
