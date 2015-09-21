package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created by Juan on 17/09/2015.
 */
public class TennisBall extends Ball {
    public TennisBall(BounceBehavior bounceBehavior){
        super(bounceBehavior);
        deflateBehavior = new Deflatable();
        type = "Tennis ball";
    }
}
