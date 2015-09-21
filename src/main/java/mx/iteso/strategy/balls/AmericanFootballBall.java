package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall(BounceBehavior bounceBehavior) {
        super(bounceBehavior);
        deflateBehavior = new Deflatable();
        type = "American Football ball";
    }
}
