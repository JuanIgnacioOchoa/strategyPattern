package mx.iteso.strategy.LifeSaver;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatation;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Juan on 20/09/2015.
 */
public class FoamFloats extends Lifesaver {
    public FoamFloats() {
        type = "FoamFloats";
        deflateBehavior = new NotDeflatable();
        floatingBehavior = new Floatation();
    }
}

