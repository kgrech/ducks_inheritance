package com.github.kgrech.ducks;

public abstract class SilentDuck extends Duck {
    @Override
    public String sound() {
        return "no";
    }
}
