mod ducks;
mod strategy;

use ducks::DuckType::*;

fn main() {
    GreyDuck.create().live();
    BrownDuck.create().live();
    PlasticDuck.create().live();
    RubberDuck.create().live();
    WoodenDuck.create().live();
}
