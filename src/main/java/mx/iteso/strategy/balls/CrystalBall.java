package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Juan on 17/09/2015.
 */
public class CrystalBall extends Ball {
    public CrystalBall(BounceBehavior bounceBehavior){
        super(bounceBehavior);
        deflateBehavior = new NotDeflatable();
        type = "Crystal ball";
    }
}
