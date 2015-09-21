package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BaseballBall extends Ball {
    public BaseballBall(BounceBehavior bounceBehavior) {
        super(bounceBehavior);
        deflateBehavior = new NotDeflatable();
        type = "Baseball ball";
    }
}
