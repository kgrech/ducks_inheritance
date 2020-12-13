package com.github.kgrech.ducks;

public class RubberDuck extends QuackDuck {
    @Override
    public String look() {
        return "Rubber";
    }

    @Override
    public String moves() {
        return "swims";
    }
}
