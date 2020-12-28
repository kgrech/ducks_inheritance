package com.github.kgrech.ducks.strategy;

import com.github.kgrech.ducks.Duck;

public enum MoveStrategy {
    FlyStrategy {
        @Override
        public String move(Duck duck) {
            return "flies";
        }
    },
    SwimStrategy {
        @Override
        public String move(Duck duck) {
            return "swims";
        }
    };

    public abstract String move(Duck duck);
}
