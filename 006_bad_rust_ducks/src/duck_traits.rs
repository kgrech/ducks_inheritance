use crate::move_strategy::MoveStrategy;
use crate::noise_strategy::NoiseStrategy;

pub trait Visual {
    fn look(&self) -> &str;
}

pub trait Duck: Visual {
    type MoveStrategy: MoveStrategy;
    type NoiseStrategy: NoiseStrategy;

    fn live(&self)
    where
        Self: Sized,
    {
        println!(
            "The {} duck {} and makes {} noise",
            self.look(),
            Self::MoveStrategy::moves(self),
            Self::NoiseStrategy::sound(self)
        );
    }
}
