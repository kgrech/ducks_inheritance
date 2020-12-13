package com.github.kgrech.ducks;

public abstract class Duck implements Visual, Noisy, Movable {

    public void live() {
        System.out.printf("The %s duck %s and make %s noise%n",
                look(), moves(), sound());
    }

}
