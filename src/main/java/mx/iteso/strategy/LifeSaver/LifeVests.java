package mx.iteso.strategy.LifeSaver;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatation;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Juan on 20/09/2015.
 */
public class LifeVests extends Lifesaver {
    public LifeVests() {
        type = "Life Vests";
        deflateBehavior = new NotDeflatable();
        floatingBehavior = new Floatation();
    }
}
