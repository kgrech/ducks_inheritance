use crate::duck_traits::Duck;

pub struct SwimStrategy;
pub struct FlyStrategy;

pub trait MoveStrategy {
    fn moves<T: Duck>(t: &T) -> &str;
}

impl MoveStrategy for SwimStrategy {
    fn moves<T: Duck>(_t: &T) -> &str {
        "swims"
    }
}
impl MoveStrategy for FlyStrategy {
    fn moves<T: Duck>(_t: &T) -> &str {
        "flies"
    }
}
