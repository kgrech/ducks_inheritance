package com.github.kgrech.ducks;

import static com.github.kgrech.ducks.DuckType.*;

public class Main {

    public static void main(String[] args) {
        BrownDuck.create().live();
        GreyDuck.create().live();
        WoodenDuck.create().live();
        PlasticDuck.create().live();
        RubberDuck.create().live();
    }
}
