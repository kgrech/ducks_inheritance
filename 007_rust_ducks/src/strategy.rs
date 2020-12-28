use crate::ducks::Duck;

pub enum MoveStrategy {
    SwimStrategy,
    FlyStrategy,
}

impl MoveStrategy {
    pub fn moves(&self, _t: &Duck) -> &str {
        match self {
            MoveStrategy::SwimStrategy => "swims",
            MoveStrategy::FlyStrategy => "flies",
        }
    }
}

pub enum NoiseStrategy {
    QuackStrategy,
    SilentStrategy,
}

impl NoiseStrategy {
    pub fn sound(&self, _t: &Duck) -> &str {
        match self {
            NoiseStrategy::QuackStrategy => "quack",
            NoiseStrategy::SilentStrategy => "no",
        }
    }
}
