package com.github.kgrech.ducks;

public abstract class SilentSwimDuck extends SilentDuck {
    @Override
    public String moves() {
        return "swims";
    }
}
