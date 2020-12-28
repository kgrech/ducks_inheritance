use crate::duck_traits::{Duck, Visual};
use crate::move_strategy::{FlyStrategy, SwimStrategy};
use crate::noise_strategy::{QuackStrategy, SilentStrategy};

pub struct GreyDuck;
pub struct BrownDuck;
pub struct PlasticDuck;
pub struct RubberDuck;
pub struct WoodenDuck;

impl Visual for GreyDuck {
    fn look(&self) -> &str {
        "Grey"
    }
}

impl Visual for BrownDuck {
    fn look(&self) -> &str {
        "Brown"
    }
}

impl Visual for PlasticDuck {
    fn look(&self) -> &str {
        "Plastic"
    }
}

impl Visual for RubberDuck {
    fn look(&self) -> &str {
        "Rubber"
    }
}

impl Visual for WoodenDuck {
    fn look(&self) -> &str {
        "Wooden"
    }
}

impl Duck for GreyDuck {
    type MoveStrategy = FlyStrategy;
    type NoiseStrategy = QuackStrategy;
}
impl Duck for BrownDuck {
    type MoveStrategy = FlyStrategy;
    type NoiseStrategy = QuackStrategy;
}

impl Duck for PlasticDuck {
    type MoveStrategy = SwimStrategy;
    type NoiseStrategy = SilentStrategy;
}

impl Duck for RubberDuck {
    type MoveStrategy = SwimStrategy;
    type NoiseStrategy = QuackStrategy;
}

impl Duck for WoodenDuck {
    type MoveStrategy = SwimStrategy;
    type NoiseStrategy = SilentStrategy;
}
