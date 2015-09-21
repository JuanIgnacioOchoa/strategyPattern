package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class SoccerBall extends Ball {
    public SoccerBall(BounceBehavior bounceBehavior) {
        super(bounceBehavior);
        deflateBehavior = new Deflatable();
        type = "Soccer ball";
    }
}
