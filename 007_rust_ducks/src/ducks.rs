use crate::strategy::{MoveStrategy::*, NoiseStrategy::*, *};

pub enum DuckType {
    GreyDuck,
    BrownDuck,
    PlasticDuck,
    RubberDuck,
    WoodenDuck,
}

impl DuckType {
    pub fn look(&self) -> &str {
        match self {
            DuckType::GreyDuck => "grey",
            DuckType::BrownDuck => "brown",
            DuckType::PlasticDuck => "plastic",
            DuckType::RubberDuck => "rubber",
            DuckType::WoodenDuck => "wooden",
        }
    }

    pub fn create(self) -> Duck {
        match self {
            DuckType::GreyDuck | DuckType::BrownDuck => Duck::new(self, FlyStrategy, QuackStrategy),
            DuckType::PlasticDuck | DuckType::WoodenDuck => {
                Duck::new(self, SwimStrategy, SilentStrategy)
            }
            DuckType::RubberDuck => Duck::new(self, SwimStrategy, QuackStrategy),
        }
    }
}

pub struct Duck {
    duck_type: DuckType,
    move_strategy: MoveStrategy,
    noise_strategy: NoiseStrategy,
}

impl Duck {
    pub fn new(
        duck_type: DuckType,
        move_strategy: MoveStrategy,
        noise_strategy: NoiseStrategy,
    ) -> Self {
        Self {
            duck_type,
            move_strategy,
            noise_strategy,
        }
    }

    pub fn live(&self) {
        println!(
            "The {} duck {} and makes {} noise",
            self.duck_type.look(),
            self.move_strategy.moves(self),
            self.noise_strategy.sound(self)
        );
    }
}
