package com.github.kgrech.ducks;

public abstract class Duck implements Visual {

    public void live() {
        System.out.printf("The %s duck flies and make Quack noise%n", look());
    }

}
