mod duck_traits;
mod ducks;
mod move_strategy;
mod noise_strategy;

use duck_traits::Duck;
use ducks::*;

fn main() {
    GreyDuck {}.live();
    BrownDuck {}.live();
    PlasticDuck {}.live();
    RubberDuck {}.live();
    WoodenDuck {}.live();
}
