use crate::duck_traits::Duck;

pub struct SilentStrategy;
pub struct QuackStrategy;

pub trait NoiseStrategy {
    fn sound<T: Duck>(t: &T) -> &str;
}

impl NoiseStrategy for SilentStrategy {
    fn sound<T: Duck>(_t: &T) -> &str {
        "no"
    }
}
impl NoiseStrategy for QuackStrategy {
    fn sound<T: Duck>(_t: &T) -> &str {
        "quack"
    }
}
