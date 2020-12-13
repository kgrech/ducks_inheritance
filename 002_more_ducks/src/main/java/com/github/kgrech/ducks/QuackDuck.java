package com.github.kgrech.ducks;

public abstract class QuackDuck extends Duck {
    @Override
    public String sound() {
        return "Quack";
    }
}
