package mx.iteso.strategy.LifeSaver;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatation;

/**
 * Created by Juan on 20/09/2015.
 */
public class LifeSaverCandies extends Lifesaver {
    public LifeSaverCandies() {
        type = "LifeSaver Candies";
        deflateBehavior = new Deflatable();
        floatingBehavior = new Floatation();
    }
}

